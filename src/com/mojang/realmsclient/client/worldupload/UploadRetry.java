package com.mojang.realmsclient.client.worldupload;

import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.concurrent.ThreadLocalRandom;
import org.jspecify.annotations.Nullable;

final class UploadRetry {
   public static final int MAX_ATTEMPTS = 5;
   private static final Duration SLEEP_SLICE = Duration.ofMillis(100L);

   public static boolean isSuccessful(final int statusCode) {
      return statusCode >= 200 && statusCode < 300;
   }

   public static boolean isTransient(final int statusCode) {
      return statusCode == 408 || statusCode == 429 || statusCode >= 500 && statusCode < 600;
   }

   public Duration delay(final @Nullable HttpResponse<?> response, final int zeroBasedAttempt) {
      return this.delayFromHeader(response == null ? null : response.headers().firstValue("Retry-After").orElse(null), zeroBasedAttempt);
   }

   public Duration delayFromHeader(final @Nullable String value, final int zeroBasedAttempt) {
      if (zeroBasedAttempt < 0) {
         throw new IllegalArgumentException("Retry attempt must not be negative");
      }

      if (value != null) {
         Duration retryAfter = this.retryAfter(value.trim());
         if (retryAfter != null) {
            return retryAfter;
         }
      }

      long backoffMillis = Math.min(1000L << Math.min(zeroBasedAttempt, 5), 30000L);
      return Duration.ofMillis(Math.round(backoffMillis * ThreadLocalRandom.current().nextDouble(0.5, 1.5)));
   }

   private @Nullable Duration retryAfter(final String value) {
      if (!value.isEmpty() && value.chars().allMatch(character -> character >= 48 && character <= 57)) {
         try {
            return Duration.ofSeconds(Long.parseLong(value));
         } catch (NumberFormatException e) {
            return null;
         }
      } else {
         try {
            Duration delay = Duration.between(Instant.now(), ZonedDateTime.parse(value, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant());
            return delay.isNegative() ? Duration.ZERO : delay;
         } catch (DateTimeParseException e) {
            return null;
         }
      }
   }

   public void sleep(final Duration delay, final UploadCancellation cancellation) {
      cancellation.throwIfCancelled();
      if (delay.isNegative()) {
         throw new IllegalArgumentException("Retry delay must not be negative");
      }

      Duration remaining = delay;

      while (!remaining.isZero()) {
         Duration slice = remaining.compareTo(SLEEP_SLICE) > 0 ? SLEEP_SLICE : remaining;
         long milliseconds = (slice.toNanos() + 999999L) / 1000000L;

         try {
            Thread.sleep(milliseconds);
         } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RealmsUploadCanceledException();
         }

         cancellation.throwIfCancelled();
         remaining = remaining.minus(slice);
      }
   }
}
