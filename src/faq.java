import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class faq extends fao {
   private static final Logger j = LogUtils.getLogger();
   public String a = "";
   public String b = "";
   public String c = "";
   public String d = "";
   public String e = "";
   @Nullable
   public String f;
   public String g = "";
   public String h = "";
   public faq.a i = faq.a.a;

   public static faq a(JsonObject $$0) {
      faq $$1 = new faq();

      try {
         $$1.a = fcl.b("id", $$0, "");
         $$1.b = fcl.b("name", $$0, "");
         $$1.c = fcl.b("version", $$0, "");
         $$1.d = fcl.b("author", $$0, "");
         $$1.e = fcl.b("link", $$0, "");
         $$1.f = fcl.b("image", $$0, null);
         $$1.g = fcl.b("trailer", $$0, "");
         $$1.h = fcl.b("recommendedPlayers", $$0, "");
         $$1.i = faq.a.valueOf(fcl.b("type", $$0, faq.a.a.name()));
      } catch (Exception var3) {
         j.error("Could not parse WorldTemplate: {}", var3.getMessage());
      }

      return $$1;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
