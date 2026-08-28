import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fck extends fci {
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
   public fck.a i = fck.a.a;

   public static fck a(JsonObject $$0) {
      fck $$1 = new fck();

      try {
         $$1.a = fef.b("id", $$0, "");
         $$1.b = fef.b("name", $$0, "");
         $$1.c = fef.b("version", $$0, "");
         $$1.d = fef.b("author", $$0, "");
         $$1.e = fef.b("link", $$0, "");
         $$1.f = fef.b("image", $$0, null);
         $$1.g = fef.b("trailer", $$0, "");
         $$1.h = fef.b("recommendedPlayers", $$0, "");
         $$1.i = fck.a.valueOf(fef.b("type", $$0, fck.a.a.name()));
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
