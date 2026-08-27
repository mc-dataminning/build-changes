import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fda extends fcy {
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
   public fda.a i = fda.a.a;

   public static fda a(JsonObject $$0) {
      fda $$1 = new fda();

      try {
         $$1.a = fev.b("id", $$0, "");
         $$1.b = fev.b("name", $$0, "");
         $$1.c = fev.b("version", $$0, "");
         $$1.d = fev.b("author", $$0, "");
         $$1.e = fev.b("link", $$0, "");
         $$1.f = fev.b("image", $$0, null);
         $$1.g = fev.b("trailer", $$0, "");
         $$1.h = fev.b("recommendedPlayers", $$0, "");
         $$1.i = fda.a.valueOf(fev.b("type", $$0, fda.a.a.name()));
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
