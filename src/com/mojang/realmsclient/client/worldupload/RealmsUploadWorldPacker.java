package com.mojang.realmsclient.client.worldupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;

public class RealmsUploadWorldPacker {
   private static final long SIZE_LIMIT = 5368709120L;
   private static final String WORLD_FOLDER_NAME = "world";
   private final BooleanSupplier isCanceled;
   private final Path directoryToPack;

   public static File pack(final Path directoryToPack, final BooleanSupplier isCanceled) throws IOException {
      return new RealmsUploadWorldPacker(directoryToPack, isCanceled).tarGzipArchive(File.createTempFile("realms-upload-file", ".tar.gz"));
   }

   private RealmsUploadWorldPacker(final Path directoryToPack, final BooleanSupplier isCanceled) {
      this.isCanceled = isCanceled;
      this.directoryToPack = directoryToPack;
   }

   private File tarGzipArchive(final File file) throws IOException {
      try {
         try (
            OutputStream output = new FileOutputStream(file);
            GZIPOutputStream gzip = new GZIPOutputStream(output);
         ) {
            TarArchiveOutputStream tar = new TarArchiveOutputStream(gzip);

            try {
               tar.setLongFileMode(3);
               this.addFileToTarGz(tar, this.directoryToPack, "world", true);
               if (this.isCanceled.getAsBoolean()) {
                  throw new RealmsUploadCanceledException();
               }

               tar.finish();
            } catch (Throwable var11) {
               try {
                  tar.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }

               throw var11;
            }

            tar.close();
         }

         this.verifyBelowSizeLimit(file.length());
         return file;
      } catch (IOException | RuntimeException | Error e) {
         try {
            Files.deleteIfExists(file.toPath());
         } catch (IOException cleanupFailure) {
            e.addSuppressed(cleanupFailure);
         }

         throw e;
      }
   }

   private void addFileToTarGz(final TarArchiveOutputStream out, final Path path, final String base, final boolean root) throws IOException {
      if (this.isCanceled.getAsBoolean()) {
         throw new RealmsUploadCanceledException();
      }

      this.verifyBelowSizeLimit(out.getBytesWritten());
      File file = path.toFile();
      String entryName = root ? base : base + file.getName();
      TarArchiveEntry entry = new TarArchiveEntry(file, entryName);
      out.putArchiveEntry(entry);
      if (file.isFile()) {
         try (InputStream is = new FileInputStream(file)) {
            is.transferTo(out);
         }

         out.closeArchiveEntry();
      } else {
         out.closeArchiveEntry();
         File[] children = file.listFiles();
         if (children != null) {
            for (File child : children) {
               this.addFileToTarGz(out, child.toPath(), entryName + "/", false);
            }
         }
      }
   }

   private void verifyBelowSizeLimit(final long sizeInByte) {
      if (sizeInByte > 5368709120L) {
         throw new RealmsUploadTooLargeException(5368709120L);
      }
   }
}
