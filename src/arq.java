import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class arq {
   private static final Logger b = LogUtils.getLogger();
   public static final ListeningExecutorService a = MoreExecutors.listeningDecorator(
      Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setUncaughtExceptionHandler(new r(b)).setNameFormat("Downloader %d").build())
   );

   private arq() {
   }

   public static CompletableFuture<?> a(File $$0, URL $$1, Map<String, String> $$2, int $$3, @Nullable asd $$4, Proxy $$5) {
      return CompletableFuture.supplyAsync(() -> {
         HttpURLConnection $$6 = null;
         InputStream $$7 = null;
         OutputStream $$8 = null;
         if ($$4 != null) {
            $$4.b(tn.c("resourcepack.downloading"));
            $$4.c(tn.c("resourcepack.requesting"));
         }

         try {
            byte[] $$9 = new byte[4096];
            $$6 = (HttpURLConnection)$$1.openConnection($$5);
            $$6.setInstanceFollowRedirects(true);
            float $$10 = 0.0F;
            float $$11 = (float)$$2.entrySet().size();

            for (Entry<String, String> $$12 : $$2.entrySet()) {
               $$6.setRequestProperty($$12.getKey(), $$12.getValue());
               if ($$4 != null) {
                  $$4.a((int)(++$$10 / $$11 * 100.0F));
               }
            }

            $$7 = $$6.getInputStream();
            $$11 = (float)$$6.getContentLength();
            int $$13 = $$6.getContentLength();
            if ($$4 != null) {
               $$4.c(tn.a("resourcepack.progress", String.format(Locale.ROOT, "%.2f", $$11 / 1000.0F / 1000.0F)));
            }

            if ($$0.exists()) {
               long $$14 = $$0.length();
               if ($$14 == (long)$$13) {
                  if ($$4 != null) {
                     $$4.a();
                  }

                  return null;
               }

               b.warn("Deleting {} as it does not match what we currently have ({} vs our {}).", new Object[]{$$0, $$13, $$14});
               FileUtils.deleteQuietly($$0);
            } else if ($$0.getParentFile() != null) {
               $$0.getParentFile().mkdirs();
            }

            $$8 = new DataOutputStream(new FileOutputStream($$0));
            if ($$3 > 0 && $$11 > (float)$$3) {
               if ($$4 != null) {
                  $$4.a();
               }

               throw new IOException("Filesize is bigger than maximum allowed (file is " + $$10 + ", limit is " + $$3 + ")");
            } else {
               int $$15;
               while (($$15 = $$7.read($$9)) >= 0) {
                  $$10 += (float)$$15;
                  if ($$4 != null) {
                     $$4.a((int)($$10 / $$11 * 100.0F));
                  }

                  if ($$3 > 0 && $$10 > (float)$$3) {
                     if ($$4 != null) {
                        $$4.a();
                     }

                     throw new IOException("Filesize was bigger than maximum allowed (got >= " + $$10 + ", limit was " + $$3 + ")");
                  }

                  if (Thread.interrupted()) {
                     b.error("INTERRUPTED");
                     if ($$4 != null) {
                        $$4.a();
                     }

                     return null;
                  }

                  $$8.write($$9, 0, $$15);
               }

               if ($$4 != null) {
                  $$4.a();
               }

               return null;
            }
         } catch (Throwable var21) {
            b.error("Failed to download file", var21);
            if ($$6 != null) {
               InputStream $$17 = $$6.getErrorStream();

               try {
                  b.error("HTTP response error: {}", IOUtils.toString($$17, StandardCharsets.UTF_8));
               } catch (IOException var20) {
                  b.error("Failed to read response from server");
               }
            }

            if ($$4 != null) {
               $$4.a();
            }

            return null;
         } finally {
            IOUtils.closeQuietly($$7);
            IOUtils.closeQuietly($$8);
         }
      }, a);
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
}
