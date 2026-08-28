import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhz extends fhx {
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
   public fhz.a i = fhz.a.a;

   public static fhz a(JsonObject $$0) {
      fhz $$1 = new fhz();

      try {
         $$1.a = fjt.b("id", $$0, "");
         $$1.b = fjt.b("name", $$0, "");
         $$1.c = fjt.b("version", $$0, "");
         $$1.d = fjt.b("author", $$0, "");
         $$1.e = fjt.b("link", $$0, "");
         $$1.f = fjt.b("image", $$0, null);
         $$1.g = fjt.b("trailer", $$0, "");
         $$1.h = fjt.b("recommendedPlayers", $$0, "");
         $$1.i = fhz.a.valueOf(fjt.b("type", $$0, fhz.a.a.name()));
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
