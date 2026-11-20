package com.mojang.realmsclient.client.worldupload;

import net.minecraft.network.chat.Component;

public class ContentV2UploadException extends RealmsUploadException {
   private final ContentV2UploadException.Error error;

   public ContentV2UploadException(final ContentV2UploadException.Error error) {
      this.error = error;
   }

   @Override
   public String getMessage() {
      return this.error.name();
   }

   @Override
   public Component getStatusMessage() {
      return Component.translatable("mco.upload.failed", Component.translatable(this.error.translationKey));
   }

   public enum Error {
      SESSION_CREATE_FAILED("mco.upload.error.session_create_failed"),
      INVALID_SESSION_RESPONSE("mco.upload.error.invalid_session_response"),
      INVALID_ARCHIVE("mco.upload.error.invalid_archive"),
      FILE_TOO_LARGE("mco.upload.error.file_too_large"),
      UNSUPPORTED_ARCHIVE_FORMAT("mco.upload.error.unsupported_archive_format"),
      BLOCK_UPLOAD_UNSUPPORTED("mco.upload.error.block_upload_unsupported"),
      SINGLE_UPLOAD_FAILED("mco.upload.error.single_upload_failed"),
      BLOCK_UPLOAD_FAILED("mco.upload.error.block_upload_failed"),
      BLOCK_LIST_FAILED("mco.upload.error.block_list_failed"),
      COMPLETE_FAILED("mco.upload.error.complete_failed"),
      RENEW_FAILED("mco.upload.error.renew_failed"),
      PROCESSING_FAILED("mco.upload.error.processing_failed"),
      UNEXPECTED_PROCESSING_STATUS("mco.upload.error.unexpected_processing_status");

      private final String translationKey;

      Error(final String translationKey) {
         this.translationKey = translationKey;
      }
   }
}
