import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fce extends fcc {
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
   public fce.a i = fce.a.a;

   public static fce a(JsonObject $$0) {
      fce $$1 = new fce();

      try {
         $$1.a = fdz.b("id", $$0, "");
         $$1.b = fdz.b("name", $$0, "");
         $$1.c = fdz.b("version", $$0, "");
         $$1.d = fdz.b("author", $$0, "");
         $$1.e = fdz.b("link", $$0, "");
         $$1.f = fdz.b("image", $$0, null);
         $$1.g = fdz.b("trailer", $$0, "");
         $$1.h = fdz.b("recommendedPlayers", $$0, "");
         $$1.i = fce.a.valueOf(fdz.b("type", $$0, fce.a.a.name()));
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
