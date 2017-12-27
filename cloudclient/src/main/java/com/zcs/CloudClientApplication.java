package com.zcs;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class CloudClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CloudClientApplication.class).web(true).run(args);
	}
}
