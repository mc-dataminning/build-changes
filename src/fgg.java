import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.mojang.logging.LogUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.CountingOutputStream;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;

public class fgg {
   static final Logger a = LogUtils.getLogger();
   volatile boolean b;
   volatile boolean c;
   volatile boolean d;
   volatile boolean e;
   @Nullable
   private volatile File f;
   volatile File g;
   @Nullable
   private volatile HttpGet h;
   @Nullable
   private Thread i;
   private final RequestConfig j = RequestConfig.custom().setSocketTimeout(120000).setConnectTimeout(120000).build();
   private static final String[] k = new String[]{
      "CON",
      "COM",
      "PRN",
      "AUX",
      "CLOCK$",
      "NUL",
      "COM1",
      "COM2",
      "COM3",
      "COM4",
      "COM5",
      "COM6",
      "COM7",
      "COM8",
      "COM9",
      "LPT1",
      "LPT2",
      "LPT3",
      "LPT4",
      "LPT5",
      "LPT6",
      "LPT7",
      "LPT8",
      "LPT9"
   };

   public long a(String $$0) {
      CloseableHttpClient $$1 = null;
      HttpGet $$2 = null;

      long var5;
      try {
         $$2 = new HttpGet($$0);
         $$1 = HttpClientBuilder.create().setDefaultRequestConfig(this.j).build();
         CloseableHttpResponse $$3 = $$1.execute($$2);
         return Long.parseLong($$3.getFirstHeader("Content-Length").getValue());
      } catch (Throwable var16) {
         a.error("Unable to get content length for download");
         var5 = 0L;
      } finally {
         if ($$2 != null) {
            $$2.releaseConnection();
         }

         if ($$1 != null) {
            try {
               $$1.close();
            } catch (IOException var15) {
               a.error("Could not close http client", var15);
            }
         }
      }

      return var5;
   }

   public void a(fhz $$0, String $$1, fiw.a $$2, eve $$3) {
      if (this.i == null) {
         this.i = new Thread(() -> {
            CloseableHttpClient $$4 = null;

            try {
               this.f = File.createTempFile("backup", ".tar.gz");
               this.h = new HttpGet($$0.a);
               $$4 = HttpClientBuilder.create().setDefaultRequestConfig(this.j).build();
               HttpResponse $$5 = $$4.execute(this.h);
               $$2.b = Long.parseLong($$5.getFirstHeader("Content-Length").getValue());
               if ($$5.getStatusLine().getStatusCode() == 200) {
                  OutputStream $$12 = new FileOutputStream(this.f);
                  fgg.b $$13 = new fgg.b($$1.trim(), this.f, $$3, $$2);
                  fgg.a $$14 = new fgg.a($$12);
                  $$14.a($$13);
                  IOUtils.copy($$5.getEntity().getContent(), $$14);
                  return;
               }

               this.d = true;
               this.h.abort();
            } catch (Exception var93) {
               a.error("Caught exception while downloading: {}", var93.getMessage());
               this.d = true;
               return;
            } finally {
               this.h.releaseConnection();
               if (this.f != null) {
                  this.f.delete();
               }

               if (!this.d) {
                  if (!$$0.b.isEmpty() && !$$0.c.isEmpty()) {
                     try {
                        this.f = File.createTempFile("resources", ".tar.gz");
                        this.h = new HttpGet($$0.b);
                        HttpResponse $$28 = $$4.execute(this.h);
                        $$2.b = Long.parseLong($$28.getFirstHeader("Content-Length").getValue());
                        if ($$28.getStatusLine().getStatusCode() != 200) {
                           this.d = true;
                           this.h.abort();
                           return;
                        }

                        OutputStream $$29 = new FileOutputStream(this.f);
                        fgg.c $$30 = new fgg.c(this.f, $$2, $$0);
                        fgg.a $$31 = new fgg.a($$29);
                        $$31.a($$30);
                        IOUtils.copy($$28.getEntity().getContent(), $$31);
                     } catch (Exception var91) {
                        a.error("Caught exception while downloading: {}", var91.getMessage());
                        this.d = true;
                     } finally {
                        this.h.releaseConnection();
                        if (this.f != null) {
                           this.f.delete();
                        }
                     }
                  } else {
                     this.c = true;
                  }
               }

               if ($$4 != null) {
                  try {
                     $$4.close();
                  } catch (IOException var90) {
                     a.error("Failed to close Realms download client");
                  }
               }
            }
         });
         this.i.setUncaughtExceptionHandler(new fid(a));
         this.i.start();
      }
   }

   public void a() {
      if (this.h != null) {
         this.h.abort();
      }

      if (this.f != null) {
         this.f.delete();
      }

      this.b = true;
   }

   public boolean b() {
      return this.c;
   }

   public boolean c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static String b(String $$0) {
      $$0 = $$0.replaceAll("[\\./\"]", "_");

      for (String $$1 : k) {
         if ($$0.equalsIgnoreCase($$1)) {
            $$0 = "_" + $$0 + "_";
         }
      }

      return $$0;
   }

   void a(String $$0, @Nullable File $$1, eve $$2) throws IOException {
      Pattern $$3 = Pattern.compile(".*-([0-9]+)$");
      int $$4 = 1;

      for (char $$5 : ab.bc) {
         $$0 = $$0.replace($$5, '_');
      }

      if (StringUtils.isEmpty($$0)) {
         $$0 = "Realm";
      }

      $$0 = b($$0);

      try {
         for (eve.b $$6 : $$2.b()) {
            String $$7 = $$6.a();
            if ($$7.toLowerCase(Locale.ROOT).startsWith($$0.toLowerCase(Locale.ROOT))) {
               Matcher $$8 = $$3.matcher($$7);
               if ($$8.matches()) {
                  int $$9 = Integer.parseInt($$8.group(1));
                  if ($$9 > $$4) {
                     $$4 = $$9;
                  }
               } else {
                  $$4++;
               }
            }
         }
      } catch (Exception var43) {
         a.error("Error getting level list", var43);
         this.d = true;
         return;
      }

      String $$13;
      if ($$2.a($$0) && $$4 <= 1) {
         $$13 = $$0;
      } else {
         $$13 = $$0 + ($$4 == 1 ? "" : "-" + $$4);
         if (!$$2.a($$13)) {
            boolean $$12 = false;

            while (!$$12) {
               $$4++;
               $$13 = $$0 + ($$4 == 1 ? "" : "-" + $$4);
               if ($$2.a($$13)) {
                  $$12 = true;
               }
            }
         }
      }

      TarArchiveInputStream $$14 = null;
      File $$15 = new File(fli.Q().q.getAbsolutePath(), "saves");

      try {
         $$15.mkdir();
         $$14 = new TarArchiveInputStream(new GzipCompressorInputStream(new BufferedInputStream(new FileInputStream($$1))));

         for (TarArchiveEntry $$16 = $$14.getNextTarEntry(); $$16 != null; $$16 = $$14.getNextTarEntry()) {
            File $$17 = new File($$15, $$16.getName().replace("world", $$13));
            if ($$16.isDirectory()) {
               $$17.mkdirs();
            } else {
               $$17.createNewFile();

               try (FileOutputStream $$18 = new FileOutputStream($$17)) {
                  IOUtils.copy($$14, $$18);
               }
            }
         }
      } catch (Exception var41) {
         a.error("Error extracting world", var41);
         this.d = true;
      } finally {
         if ($$14 != null) {
            $$14.close();
         }

         if ($$1 != null) {
            $$1.delete();
         }

         try (eve.c $$26 = $$2.d($$13)) {
            $$26.b($$13);
         } catch (ub | uh | IOException var39) {
            a.error("Failed to modify unpacked realms level {}", $$13, var39);
         } catch (fao var40) {
            a.warn("{}", var40.getMessage());
         }

         this.g = new File($$15, $$13 + File.separator + "resources.zip");
      }
   }

   static class a extends CountingOutputStream {
      @Nullable
      private ActionListener a;

      public a(OutputStream $$0) {
         super($$0);
      }

      public void a(ActionListener $$0) {
         this.a = $$0;
      }

      protected void afterWrite(int $$0) throws IOException {
         super.afterWrite($$0);
         if (this.a != null) {
            this.a.actionPerformed(new ActionEvent(this, 0, null));
         }
      }
   }

   class b implements ActionListener {
      private final String b;
      private final File c;
      private final eve d;
      private final fiw.a e;

      b(final String $$0, final File $$1, final eve $$2, final fiw.a $$3) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
      }

      @Override
      public void actionPerformed(ActionEvent $$0) {
         this.e.a = ((fgg.a)$$0.getSource()).getByteCount();
         if (this.e.a >= this.e.b && !fgg.this.b && !fgg.this.d) {
            try {
               fgg.this.e = true;
               fgg.this.a(this.b, this.c, this.d);
            } catch (IOException var3) {
               fgg.a.error("Error extracting archive", var3);
               fgg.this.d = true;
            }
         }
      }
   }

   class c implements ActionListener {
      private final File b;
      private final fiw.a c;
      private final fhz d;

      c(final File $$0, final fiw.a $$1, final fhz $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public void actionPerformed(ActionEvent $$0) {
         this.c.a = ((fgg.a)$$0.getSource()).getByteCount();
         if (this.c.a >= this.c.b && !fgg.this.b) {
            try {
               String $$1 = Hashing.sha1().hashBytes(Files.toByteArray(this.b)).toString();
               if ($$1.equals(this.d.c)) {
                  FileUtils.copyFile(this.b, fgg.this.g);
                  fgg.this.c = true;
               } else {
                  fgg.a.error("Resourcepack had wrong hash (expected {}, found {}). Deleting it.", this.d.c, $$1);
                  FileUtils.deleteQuietly(this.b);
                  fgg.this.d = true;
               }
            } catch (IOException var3) {
               fgg.a.error("Error copying resourcepack file: {}", var3.getMessage());
               fgg.this.d = true;
            }
         }
      }
   }
}
