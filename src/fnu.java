import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnu extends fns {
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
   public fnu.a i = fnu.a.a;

   public static fnu a(JsonObject $$0) {
      fnu $$1 = new fnu();

      try {
         $$1.a = fpp.b("id", $$0, "");
         $$1.b = fpp.b("name", $$0, "");
         $$1.c = fpp.b("version", $$0, "");
         $$1.d = fpp.b("author", $$0, "");
         $$1.e = fpp.b("link", $$0, "");
         $$1.f = fpp.b("image", $$0, null);
         $$1.g = fpp.b("trailer", $$0, "");
         $$1.h = fpp.b("recommendedPlayers", $$0, "");
         $$1.i = fnu.a.valueOf(fpp.b("type", $$0, fnu.a.a.name()));
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
