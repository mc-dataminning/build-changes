package com.mojang.realmsclient.exception;

import com.mojang.realmsclient.client.RealmsError;
import org.jspecify.annotations.Nullable;

public class RealmsServiceException extends Exception {
   public final RealmsError realmsError;
   public final @Nullable String retryAfterHeader;

   public RealmsServiceException(final RealmsError error) {
      this(error, null);
   }

   public RealmsServiceException(final RealmsError error, final @Nullable String retryAfterHeader) {
      this.realmsError = error;
      this.retryAfterHeader = retryAfterHeader;
   }

   @Override
   public String getMessage() {
      return this.realmsError.logMessage();
   }
}
