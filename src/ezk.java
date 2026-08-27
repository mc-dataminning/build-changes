import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface ezk {
   wx a = wx.c("mco.errorMessage.noDetails");
   Logger b = LogUtils.getLogger();

   int a();

   wx b();

   String c();

   static ezk a(int $$0, String $$1) {
      if ($$0 == 429) {
         return ezk.b.c;
      } else if (Strings.isNullOrEmpty($$1)) {
         return ezk.b.b($$0);
      } else {
         try {
            JsonObject $$2 = JsonParser.parseString($$1).getAsJsonObject();
            String $$3 = axu.a($$2, "reason", null);
            String $$4 = axu.a($$2, "errorMsg", null);
            int $$5 = axu.a($$2, "errorCode", -1);
            if ($$4 != null || $$3 != null || $$5 != -1) {
               return new ezk.c($$0, $$5 != -1 ? $$5 : $$0, $$3, $$4);
            }
         } catch (Exception var6) {
            b.error("Could not parse RealmsError", var6);
         }

         return new ezk.d($$0, $$1);
      }
   }

   public static record a(String d) implements ezk {
      public static final int c = 401;

      @Override
      public int a() {
         return 401;
      }

      @Override
      public wx b() {
         return wx.b(this.d);
      }

      @Override
      public String c() {
         return String.format(Locale.ROOT, "Realms authentication error with message '%s'", this.d);
      }
   }

   public static record b(int e, @Nullable wx f) implements ezk {
      public static final ezk.b c = new ezk.b(429, wx.c("mco.errorMessage.serviceBusy"));
      public static final wx d = wx.c("mco.errorMessage.retry");

      public static ezk.b a(String $$0) {
         return new ezk.b(500, wx.a("mco.errorMessage.realmsService.unknownCompatibility", $$0));
      }

      public static ezk.b a(fau $$0) {
         return new ezk.b(500, wx.a("mco.errorMessage.realmsService.connectivity", $$0.getMessage()));
      }

      public static ezk.b a(int $$0) {
         return new ezk.b($$0, d);
      }

      public static ezk.b b(int $$0) {
         return new ezk.b($$0, null);
      }

      @Override
      public int a() {
         return this.e;
      }

      @Override
      public wx b() {
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
      public wx e() {
         return this.f;
      }
   }

   public static record c(int c, int d, @Nullable String e, @Nullable String f) implements ezk {
      @Override
      public int a() {
         return this.d;
      }

      @Override
      public wx b() {
         String $$0 = "mco.errorMessage." + this.d;
         if (gpb.a($$0)) {
            return wx.c($$0);
         } else {
            if (this.e != null) {
               String $$1 = "mco.errorReason." + this.e;
               if (gpb.a($$1)) {
                  return wx.c($$1);
               }
            }

            return (wx)(this.f != null ? wx.b(this.f) : a);
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

   public static record d(int c, String d) implements ezk {
      @Override
      public int a() {
         return this.c;
      }

      @Override
      public wx b() {
         return wx.b(this.d);
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
