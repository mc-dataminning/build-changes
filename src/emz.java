import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface emz {
   ui a = ui.c("mco.errorMessage.noDetails");
   Logger b = LogUtils.getLogger();

   int a();

   ui b();

   String c();

   static emz a(int $$0, String $$1) {
      if ($$0 == 429) {
         return emz.b.c;
      } else if (Strings.isNullOrEmpty($$1)) {
         return emz.b.b($$0);
      } else {
         try {
            JsonObject $$2 = JsonParser.parseString($$1).getAsJsonObject();
            String $$3 = aso.a($$2, "reason", null);
            String $$4 = aso.a($$2, "errorMsg", null);
            int $$5 = aso.a($$2, "errorCode", -1);
            if ($$4 != null || $$3 != null || $$5 != -1) {
               return new emz.c($$0, $$5 != -1 ? $$5 : $$0, $$3, $$4);
            }
         } catch (Exception var6) {
            b.error("Could not parse RealmsError", var6);
         }

         return new emz.d($$0, $$1);
      }
   }

   public static record a(String d) implements emz {
      public static final int c = 401;

      @Override
      public int a() {
         return 401;
      }

      @Override
      public ui b() {
         return ui.b(this.d);
      }

      @Override
      public String c() {
         return String.format(Locale.ROOT, "Realms authentication error with message '%s'", this.d);
      }
   }

   public static record b(int e, @Nullable ui f) implements emz {
      public static final emz.b c = new emz.b(429, ui.c("mco.errorMessage.serviceBusy"));
      public static final ui d = ui.c("mco.errorMessage.retry");

      public static emz.b a(String $$0) {
         return new emz.b(500, ui.a("mco.errorMessage.realmsService.unknownCompatibility", $$0));
      }

      public static emz.b a(eoj $$0) {
         return new emz.b(500, ui.a("mco.errorMessage.realmsService.connectivity", $$0.getMessage()));
      }

      public static emz.b a(int $$0) {
         return new emz.b($$0, d);
      }

      public static emz.b b(int $$0) {
         return new emz.b($$0, null);
      }

      @Override
      public int a() {
         return this.e;
      }

      @Override
      public ui b() {
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
      public ui e() {
         return this.f;
      }
   }

   public static record c(int c, int d, @Nullable String e, @Nullable String f) implements emz {
      @Override
      public int a() {
         return this.d;
      }

      @Override
      public ui b() {
         String $$0 = "mco.errorMessage." + this.d;
         if (gbg.a($$0)) {
            return ui.c($$0);
         } else {
            if (this.e != null) {
               String $$1 = "mco.errorReason." + this.e;
               if (gbg.a($$1)) {
                  return ui.c($$1);
               }
            }

            return (ui)(this.f != null ? ui.b(this.f) : a);
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

   public static record d(int c, String d) implements emz {
      @Override
      public int a() {
         return this.c;
      }

      @Override
      public ui b() {
         return ui.b(this.d);
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
