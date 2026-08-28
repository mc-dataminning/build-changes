import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fde extends fdc {
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
   public fde.a i = fde.a.a;

   public static fde a(JsonObject $$0) {
      fde $$1 = new fde();

      try {
         $$1.a = fez.b("id", $$0, "");
         $$1.b = fez.b("name", $$0, "");
         $$1.c = fez.b("version", $$0, "");
         $$1.d = fez.b("author", $$0, "");
         $$1.e = fez.b("link", $$0, "");
         $$1.f = fez.b("image", $$0, null);
         $$1.g = fez.b("trailer", $$0, "");
         $$1.h = fez.b("recommendedPlayers", $$0, "");
         $$1.i = fde.a.valueOf(fez.b("type", $$0, fde.a.a.name()));
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
