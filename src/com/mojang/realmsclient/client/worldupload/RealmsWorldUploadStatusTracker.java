package com.mojang.realmsclient.client.worldupload;

import com.mojang.realmsclient.client.UploadStatus;

public interface RealmsWorldUploadStatusTracker {
   UploadStatus getUploadStatus();

   void setUploading();

   void setCommitting();

   void setProcessing();

   static RealmsWorldUploadStatusTracker noOp() {
      return new RealmsWorldUploadStatusTracker() {
         private final UploadStatus uploadStatus = new UploadStatus();

         @Override
         public UploadStatus getUploadStatus() {
            return this.uploadStatus;
         }

         @Override
         public void setUploading() {
         }

         @Override
         public void setCommitting() {
         }

         @Override
         public void setProcessing() {
         }
      };
   }
}
