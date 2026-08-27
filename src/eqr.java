import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface eqr {
   vf a = vf.c("mco.errorMessage.noDetails");
   Logger b = LogUtils.getLogger();

   int a();

   vf b();

   String c();

   static eqr a(int $$0, String $$1) {
      if ($$0 == 429) {
         return eqr.b.c;
      } else if (Strings.isNullOrEmpty($$1)) {
         return eqr.b.b($$0);
      } else {
         try {
            JsonObject $$2 = JsonParser.parseString($$1).getAsJsonObject();
            String $$3 = aud.a($$2, "reason", null);
            String $$4 = aud.a($$2, "errorMsg", null);
            int $$5 = aud.a($$2, "errorCode", -1);
            if ($$4 != null || $$3 != null || $$5 != -1) {
               return new eqr.c($$0, $$5 != -1 ? $$5 : $$0, $$3, $$4);
            }
         } catch (Exception var6) {
            b.error("Could not parse RealmsError", var6);
         }

         return new eqr.d($$0, $$1);
      }
   }

   public static record a(String d) implements eqr {
      public static final int c = 401;

      @Override
      public int a() {
         return 401;
      }

      @Override
      public vf b() {
         return vf.b(this.d);
      }

      @Override
      public String c() {
         return String.format(Locale.ROOT, "Realms authentication error with message '%s'", this.d);
      }
   }

   public static record b(int e, @Nullable vf f) implements eqr {
      public static final eqr.b c = new eqr.b(429, vf.c("mco.errorMessage.serviceBusy"));
      public static final vf d = vf.c("mco.errorMessage.retry");

      public static eqr.b a(String $$0) {
         return new eqr.b(500, vf.a("mco.errorMessage.realmsService.unknownCompatibility", $$0));
      }

      public static eqr.b a(esb $$0) {
         return new eqr.b(500, vf.a("mco.errorMessage.realmsService.connectivity", $$0.getMessage()));
      }

      public static eqr.b a(int $$0) {
         return new eqr.b($$0, d);
      }

      public static eqr.b b(int $$0) {
         return new eqr.b($$0, null);
      }

      @Override
      public int a() {
         return this.e;
      }

      @Override
      public vf b() {
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
      public vf e() {
         return this.f;
      }
   }

   public static record c(int c, int d, @Nullable String e, @Nullable String f) implements eqr {
      @Override
      public int a() {
         return this.d;
      }

      @Override
      public vf b() {
         String $$0 = "mco.errorMessage." + this.d;
         if (gfq.a($$0)) {
            return vf.c($$0);
         } else {
            if (this.e != null) {
               String $$1 = "mco.errorReason." + this.e;
               if (gfq.a($$1)) {
                  return vf.c($$1);
               }
            }

            return (vf)(this.f != null ? vf.b(this.f) : a);
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

   public static record d(int c, String d) implements eqr {
      @Override
      public int a() {
         return this.c;
      }

      @Override
      public vf b() {
         return vf.b(this.d);
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
