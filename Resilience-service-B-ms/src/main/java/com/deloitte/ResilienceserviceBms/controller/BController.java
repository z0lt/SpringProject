package com.deloitte.ResilienceserviceBms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class BController {
	
	@GetMapping("/call")
	public ResponseEntity<String> show(){
		return new ResponseEntity<String>("Service B called", HttpStatus.OK);
	}

}
