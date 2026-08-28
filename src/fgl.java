import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface fgl {
   wp a = wp.c("mco.errorMessage.noDetails");
   Logger b = LogUtils.getLogger();

   int a();

   wp b();

   String c();

   static fgl a(int $$0, String $$1) {
      if ($$0 == 429) {
         return fgl.b.c;
      } else if (Strings.isNullOrEmpty($$1)) {
         return fgl.b.b($$0);
      } else {
         try {
            JsonObject $$2 = JsonParser.parseString($$1).getAsJsonObject();
            String $$3 = ayp.a($$2, "reason", null);
            String $$4 = ayp.a($$2, "errorMsg", null);
            int $$5 = ayp.a($$2, "errorCode", -1);
            if ($$4 != null || $$3 != null || $$5 != -1) {
               return new fgl.c($$0, $$5 != -1 ? $$5 : $$0, $$3, $$4);
            }
         } catch (Exception var6) {
            b.error("Could not parse RealmsError", var6);
         }

         return new fgl.d($$0, $$1);
      }
   }

   public static record a(String d) implements fgl {
      public static final int c = 401;

      @Override
      public int a() {
         return 401;
      }

      @Override
      public wp b() {
         return wp.b(this.d);
      }

      @Override
      public String c() {
         return String.format(Locale.ROOT, "Realms authentication error with message '%s'", this.d);
      }
   }

   public static record b(int e, @Nullable wp f) implements fgl {
      public static final fgl.b c = new fgl.b(429, wp.c("mco.errorMessage.serviceBusy"));
      public static final wp d = wp.c("mco.errorMessage.retry");

      public static fgl.b a(String $$0) {
         return new fgl.b(500, wp.a("mco.errorMessage.realmsService.unknownCompatibility", $$0));
      }

      public static fgl.b a(fie $$0) {
         return new fgl.b(500, wp.a("mco.errorMessage.realmsService.connectivity", $$0.getMessage()));
      }

      public static fgl.b a(int $$0) {
         return new fgl.b($$0, d);
      }

      public static fgl.b b(int $$0) {
         return new fgl.b($$0, null);
      }

      @Override
      public int a() {
         return this.e;
      }

      @Override
      public wp b() {
         return this.f != null ? this.f : a;
      }

      @Override
      public String c() {
         return this.f != null
            ? String.format(Locale.ROOT, "Realms service error (%d) with message '%s'", this.e, this.f.getString())
            : String.format(Locale.ROOT, "Realms service error (%d) with no payload", this.e);
      }

      public int d() {
         return this.e;
      }

      @Nullable
      public wp e() {
         return this.f;
      }
   }

   public static record c(int c, int d, @Nullable String e, @Nullable String f) implements fgl {
      @Override
      public int a() {
         return this.d;
      }

      @Override
      public wp b() {
         String $$0 = "mco.errorMessage." + this.d;
         if (hfz.a($$0)) {
            return wp.c($$0);
         } else {
            if (this.e != null) {
               String $$1 = "mco.errorReason." + this.e;
               if (hfz.a($$1)) {
                  return wp.c($$1);
               }
            }

            return (wp)(this.f != null ? wp.b(this.f) : a);
         }
      }

      @Override
      public String c() {
         return String.format(Locale.ROOT, "Realms service error (%d/%d/%s) with message '%s'", this.c, this.d, this.e, this.f);
      }

      public int d() {
         return this.c;
      }

      public int e() {
         return this.d;
      }

      @Nullable
      public String f() {
         return this.e;
      }

      @Nullable
      public String g() {
         return this.f;
      }
   }

   public static record d(int c, String d) implements fgl {
      @Override
      public int a() {
         return this.c;
      }

      @Override
      public wp b() {
         return wp.b(this.d);
      }

      @Override
      public String c() {
         return String.format(Locale.ROOT, "Realms service error (%d) with raw payload '%s'", this.c, this.d);
      }

      public int d() {
         return this.c;
      }

      public String e() {
         return this.d;
      }
   }
}
