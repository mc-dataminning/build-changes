import com.google.common.hash.Funnels;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Map;
import java.util.OptionalLong;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class ayu {
   private static final Logger a = LogUtils.getLogger();

   private ayu() {
   }

   public static Path a(Path $$0, URL $$1, Map<String, String> $$2, HashFunction $$3, @Nullable HashCode $$4, int $$5, Proxy $$6, ayu.a $$7) {
      HttpURLConnection $$8 = null;
      InputStream $$9 = null;
      $$7.a();
      Path $$10;
      if ($$4 != null) {
         $$10 = a($$0, $$4);

         try {
            if (a($$10, $$3, $$4)) {
               a.info("Returning cached file since actual hash matches requested");
               $$7.a(true);
               a($$10);
               return $$10;
            }
         } catch (IOException var35) {
            a.warn("Failed to check cached file {}", $$10, var35);
         }

         try {
            a.warn("Existing file {} not found or had mismatched hash", $$10);
            Files.deleteIfExists($$10);
         } catch (IOException var34) {
            $$7.a(false);
            throw new UncheckedIOException("Failed to remove existing file " + $$10, var34);
         }
      } else {
         $$10 = null;
      }

      Path $$18;
      try {
         $$8 = (HttpURLConnection)$$1.openConnection($$6);
         $$8.setInstanceFollowRedirects(true);
         $$2.forEach($$8::setRequestProperty);
         $$9 = $$8.getInputStream();
         long $$14 = $$8.getContentLengthLong();
         OptionalLong $$15 = $$14 != -1L ? OptionalLong.of($$14) : OptionalLong.empty();
         v.c($$0);
         $$7.a($$15);
         if ($$15.isPresent() && $$15.getAsLong() > (long)$$5) {
            throw new IOException("Filesize is bigger than maximum allowed (file is " + $$15 + ", limit is " + $$5 + ")");
         }

         if ($$10 == null) {
            Path $$17 = Files.createTempFile($$0, "download", ".tmp");

            try {
               HashCode $$18x = a($$3, $$5, $$7, $$9, $$17);
               Path $$19 = a($$0, $$18x);
               if (!a($$19, $$3, $$18x)) {
                  Files.move($$17, $$19, StandardCopyOption.REPLACE_EXISTING);
               } else {
                  a($$19);
               }

               $$7.a(true);
               return $$19;
            } finally {
               Files.deleteIfExists($$17);
            }
         }

         HashCode $$16 = a($$3, $$5, $$7, $$9, $$10);
         if (!$$16.equals($$4)) {
            throw new IOException("Hash of downloaded file (" + $$16 + ") did not match requested (" + $$4 + ")");
         }

         $$7.a(true);
         $$18 = $$10;
      } catch (Throwable var36) {
         if ($$8 != null) {
            InputStream $$21 = $$8.getErrorStream();
            if ($$21 != null) {
               try {
                  a.error("HTTP response error: {}", IOUtils.toString($$21, StandardCharsets.UTF_8));
               } catch (Exception var32) {
                  a.error("Failed to read response from server");
               }
            }
         }

         $$7.a(false);
         throw new IllegalStateException("Failed to download file " + $$1, var36);
      } finally {
         IOUtils.closeQuietly($$9);
      }

      return $$18;
   }

   private static void a(Path $$0) {
      try {
         Files.setLastModifiedTime($$0, FileTime.from(Instant.now()));
      } catch (IOException var2) {
         a.warn("Failed to update modification time of {}", $$0, var2);
      }
   }

   private static HashCode a(Path $$0, HashFunction $$1) throws IOException {
      Hasher $$2 = $$1.newHasher();

      try (
         OutputStream $$3 = Funnels.asOutputStream($$2);
         InputStream $$4 = Files.newInputStream($$0);
      ) {
         $$4.transferTo($$3);
      }

      return $$2.hash();
   }

   private static boolean a(Path $$0, HashFunction $$1, HashCode $$2) throws IOException {
      if (Files.exists($$0)) {
         HashCode $$3 = a($$0, $$1);
         if ($$3.equals($$2)) {
            return true;
         }

         a.warn("Mismatched hash of file {}, expected {} but found {}", new Object[]{$$0, $$2, $$3});
      }

      return false;
   }

   private static Path a(Path $$0, HashCode $$1) {
      return $$0.resolve($$1.toString());
   }

   private static HashCode a(HashFunction $$0, int $$1, ayu.a $$2, InputStream $$3, Path $$4) throws IOException {
      HashCode var11;
      try (OutputStream $$5 = Files.newOutputStream($$4, StandardOpenOption.CREATE)) {
         Hasher $$6 = $$0.newHasher();
         byte[] $$7 = new byte[8196];
         long $$8 = 0L;

         int $$9;
         while (($$9 = $$3.read($$7)) >= 0) {
            $$8 += (long)$$9;
            $$2.a($$8);
            if ($$8 > (long)$$1) {
               throw new IOException("Filesize was bigger than maximum allowed (got >= " + $$8 + ", limit was " + $$1 + ")");
            }

            if (Thread.interrupted()) {
               a.error("INTERRUPTED");
               throw new IOException("Download interrupted");
            }

            $$5.write($$7, 0, $$9);
            $$6.putBytes($$7, 0, $$9);
         }

         var11 = $$6.hash();
      }

      return var11;
   }

   public static int a() {
      try {
         int var1;
         try (ServerSocket $$0 = new ServerSocket(0)) {
            var1 = $$0.getLocalPort();
         }

         return var1;
      } catch (IOException var5) {
         return 25564;
      }
   }

   public static boolean a(int $$0) {
      if ($$0 >= 0 && $$0 <= 65535) {
         try {
            boolean var2;
            try (ServerSocket $$1 = new ServerSocket($$0)) {
               var2 = $$1.getLocalPort() == $$0;
            }

            return var2;
         } catch (IOException var6) {
            return false;
         }
      } else {
         return false;
      }
   }

   public interface a {
      void a();

      void a(OptionalLong var1);

      void a(long var1);

      void a(boolean var1);
   }
}
