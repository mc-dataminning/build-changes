import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public abstract class exk<T extends exk<T>> {
   protected HttpURLConnection a;
   private boolean c;
   protected String b;
   private static final int d = 60000;
   private static final int e = 5000;
   private static final String f = "Is-Prerelease";
   private static final String g = "Cookie";

   public exk(String $$0, int $$1, int $$2) {
      try {
         this.b = $$0;
         Proxy $$3 = exi.a();
         if ($$3 != null) {
            this.a = (HttpURLConnection)new URL($$0).openConnection($$3);
         } else {
            this.a = (HttpURLConnection)new URL($$0).openConnection();
         }

         this.a.setConnectTimeout($$1);
         this.a.setReadTimeout($$2);
      } catch (MalformedURLException var5) {
         throw new eyt(var5.getMessage(), var5);
      } catch (IOException var6) {
         throw new eyt(var6.getMessage(), var6);
      }
   }

   public void a(String $$0, String $$1) {
      a(this.a, $$0, $$1);
   }

   public static void a(HttpURLConnection $$0, String $$1, String $$2) {
      String $$3 = $$0.getRequestProperty("Cookie");
      if ($$3 == null) {
         $$0.setRequestProperty("Cookie", $$1 + "=" + $$2);
      } else {
         $$0.setRequestProperty("Cookie", $$3 + ";" + $$1 + "=" + $$2);
      }
   }

   public void a(boolean $$0) {
      this.a.addRequestProperty("Is-Prerelease", String.valueOf($$0));
   }

   public int a() {
      return a(this.a);
   }

   public static int a(HttpURLConnection $$0) {
      String $$1 = $$0.getHeaderField("Retry-After");

      try {
         return Integer.valueOf($$1);
      } catch (Exception var3) {
         return 5;
      }
   }

   public int b() {
      try {
         this.d();
         return this.a.getResponseCode();
      } catch (Exception var2) {
         throw new eyt(var2.getMessage(), var2);
      }
   }

   public String c() {
      try {
         this.d();
         String $$0;
         if (this.b() >= 400) {
            $$0 = this.a(this.a.getErrorStream());
         } else {
            $$0 = this.a(this.a.getInputStream());
         }

         this.f();
         return $$0;
      } catch (IOException var2) {
         throw new eyt(var2.getMessage(), var2);
      }
   }

   private String a(@Nullable InputStream $$0) throws IOException {
      if ($$0 == null) {
         return "";
      } else {
         InputStreamReader $$1 = new InputStreamReader($$0, StandardCharsets.UTF_8);
         StringBuilder $$2 = new StringBuilder();

         for (int $$3 = $$1.read(); $$3 != -1; $$3 = $$1.read()) {
            $$2.append((char)$$3);
         }

         return $$2.toString();
      }
   }

   private void f() {
      byte[] $$0 = new byte[1024];

      try {
         InputStream $$1 = this.a.getInputStream();

         while ($$1.read($$0) > 0) {
         }

         $$1.close();
         return;
      } catch (Exception var9) {
         try {
            InputStream $$3 = this.a.getErrorStream();
            if ($$3 != null) {
               while ($$3.read($$0) > 0) {
               }

               $$3.close();
               return;
            }
         } catch (IOException var8) {
            return;
         }
      } finally {
         if (this.a != null) {
            this.a.disconnect();
         }
      }
   }

   protected T d() {
      if (this.c) {
         return (T)this;
      } else {
         T $$0 = this.e();
         this.c = true;
         return $$0;
      }
   }

   protected abstract T e();

   public static exk<?> a(String $$0) {
      return new exk.b($$0, 5000, 60000);
   }

   public static exk<?> a(String $$0, int $$1, int $$2) {
      return new exk.b($$0, $$1, $$2);
   }

   public static exk<?> b(String $$0, String $$1) {
      return new exk.c($$0, $$1, 5000, 60000);
   }

   public static exk<?> a(String $$0, String $$1, int $$2, int $$3) {
      return new exk.c($$0, $$1, $$2, $$3);
   }

   public static exk<?> b(String $$0) {
      return new exk.a($$0, 5000, 60000);
   }

   public static exk<?> c(String $$0, String $$1) {
      return new exk.d($$0, $$1, 5000, 60000);
   }

   public static exk<?> b(String $$0, String $$1, int $$2, int $$3) {
      return new exk.d($$0, $$1, $$2, $$3);
   }

   public String c(String $$0) {
      return a(this.a, $$0);
   }

   public static String a(HttpURLConnection $$0, String $$1) {
      try {
         return $$0.getHeaderField($$1);
      } catch (Exception var3) {
         return "";
      }
   }

   public static class a extends exk<exk.a> {
      public a(String $$0, int $$1, int $$2) {
         super($$0, $$1, $$2);
      }

      public exk.a f() {
         try {
            this.a.setDoOutput(true);
            this.a.setRequestMethod("DELETE");
            this.a.connect();
            return this;
         } catch (Exception var2) {
            throw new eyt(var2.getMessage(), var2);
         }
      }
   }

   public static class b extends exk<exk.b> {
      public b(String $$0, int $$1, int $$2) {
         super($$0, $$1, $$2);
      }

      public exk.b f() {
         try {
            this.a.setDoInput(true);
            this.a.setDoOutput(true);
            this.a.setUseCaches(false);
            this.a.setRequestMethod("GET");
            return this;
         } catch (Exception var2) {
            throw new eyt(var2.getMessage(), var2);
         }
      }
   }

   public static class c extends exk<exk.c> {
      private final String c;

      public c(String $$0, String $$1, int $$2, int $$3) {
         super($$0, $$2, $$3);
         this.c = $$1;
      }

      public exk.c f() {
         try {
            if (this.c != null) {
               this.a.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            }

            this.a.setDoInput(true);
            this.a.setDoOutput(true);
            this.a.setUseCaches(false);
            this.a.setRequestMethod("POST");
            OutputStream $$0 = this.a.getOutputStream();
            OutputStreamWriter $$1 = new OutputStreamWriter($$0, "UTF-8");
            $$1.write(this.c);
            $$1.close();
            $$0.flush();
            return this;
         } catch (Exception var3) {
            throw new eyt(var3.getMessage(), var3);
         }
      }
   }

   public static class d extends exk<exk.d> {
      private final String c;

      public d(String $$0, String $$1, int $$2, int $$3) {
         super($$0, $$2, $$3);
         this.c = $$1;
      }

      public exk.d f() {
         try {
            if (this.c != null) {
               this.a.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            }

            this.a.setDoOutput(true);
            this.a.setDoInput(true);
            this.a.setRequestMethod("PUT");
            OutputStream $$0 = this.a.getOutputStream();
            OutputStreamWriter $$1 = new OutputStreamWriter($$0, "UTF-8");
            $$1.write(this.c);
            $$1.close();
            $$0.flush();
            return this;
         } catch (Exception var3) {
            throw new eyt(var3.getMessage(), var3);
         }
      }
   }
}
