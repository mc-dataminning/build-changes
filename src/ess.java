import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface ess {
   vq a = vq.c("mco.errorMessage.noDetails");
   Logger b = LogUtils.getLogger();

   int a();

   vq b();

   String c();

   static ess a(int $$0, String $$1) {
      if ($$0 == 429) {
         return ess.b.c;
      } else if (Strings.isNullOrEmpty($$1)) {
         return ess.b.b($$0);
      } else {
         try {
            JsonObject $$2 = JsonParser.parseString($$1).getAsJsonObject();
            String $$3 = avx.a($$2, "reason", null);
            String $$4 = avx.a($$2, "errorMsg", null);
            int $$5 = avx.a($$2, "errorCode", -1);
            if ($$4 != null || $$3 != null || $$5 != -1) {
               return new ess.c($$0, $$5 != -1 ? $$5 : $$0, $$3, $$4);
            }
         } catch (Exception var6) {
            b.error("Could not parse RealmsError", var6);
         }

         return new ess.d($$0, $$1);
      }
   }

   public static record a(String d) implements ess {
      public static final int c = 401;

      @Override
      public int a() {
         return 401;
      }

      @Override
      public vq b() {
         return vq.b(this.d);
      }

      @Override
      public String c() {
         return String.format(Locale.ROOT, "Realms authentication error with message '%s'", this.d);
      }
   }

   public static record b(int e, @Nullable vq f) implements ess {
      public static final ess.b c = new ess.b(429, vq.c("mco.errorMessage.serviceBusy"));
      public static final vq d = vq.c("mco.errorMessage.retry");

      public static ess.b a(String $$0) {
         return new ess.b(500, vq.a("mco.errorMessage.realmsService.unknownCompatibility", $$0));
      }

      public static ess.b a(euc $$0) {
         return new ess.b(500, vq.a("mco.errorMessage.realmsService.connectivity", $$0.getMessage()));
      }

      public static ess.b a(int $$0) {
         return new ess.b($$0, d);
      }

      public static ess.b b(int $$0) {
         return new ess.b($$0, null);
      }

      @Override
      public int a() {
         return this.e;
      }

      @Override
      public vq b() {
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
      public vq e() {
         return this.f;
      }
   }

   public static record c(int c, int d, @Nullable String e, @Nullable String f) implements ess {
      @Override
      public int a() {
         return this.d;
      }

      @Override
      public vq b() {
         String $$0 = "mco.errorMessage." + this.d;
         if (ghz.a($$0)) {
            return vq.c($$0);
         } else {
            if (this.e != null) {
               String $$1 = "mco.errorReason." + this.e;
               if (ghz.a($$1)) {
                  return vq.c($$1);
               }
            }

            return (vq)(this.f != null ? vq.b(this.f) : a);
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

   public static record d(int c, String d) implements ess {
      @Override
      public int a() {
         return this.c;
      }

      @Override
      public vq b() {
         return vq.b(this.d);
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
