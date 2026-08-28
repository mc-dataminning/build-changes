import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdc extends fda {
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
   public fdc.a i = fdc.a.a;

   public static fdc a(JsonObject $$0) {
      fdc $$1 = new fdc();

      try {
         $$1.a = fex.b("id", $$0, "");
         $$1.b = fex.b("name", $$0, "");
         $$1.c = fex.b("version", $$0, "");
         $$1.d = fex.b("author", $$0, "");
         $$1.e = fex.b("link", $$0, "");
         $$1.f = fex.b("image", $$0, null);
         $$1.g = fex.b("trailer", $$0, "");
         $$1.h = fex.b("recommendedPlayers", $$0, "");
         $$1.i = fdc.a.valueOf(fex.b("type", $$0, fdc.a.a.name()));
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
