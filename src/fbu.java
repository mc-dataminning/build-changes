import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbu extends fbs {
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
   public fbu.a i = fbu.a.a;

   public static fbu a(JsonObject $$0) {
      fbu $$1 = new fbu();

      try {
         $$1.a = fdp.b("id", $$0, "");
         $$1.b = fdp.b("name", $$0, "");
         $$1.c = fdp.b("version", $$0, "");
         $$1.d = fdp.b("author", $$0, "");
         $$1.e = fdp.b("link", $$0, "");
         $$1.f = fdp.b("image", $$0, null);
         $$1.g = fdp.b("trailer", $$0, "");
         $$1.h = fdp.b("recommendedPlayers", $$0, "");
         $$1.i = fbu.a.valueOf(fdp.b("type", $$0, fbu.a.a.name()));
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
