import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fis extends fiq {
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
   public fis.a i = fis.a.a;

   public static fis a(JsonObject $$0) {
      fis $$1 = new fis();

      try {
         $$1.a = fkm.b("id", $$0, "");
         $$1.b = fkm.b("name", $$0, "");
         $$1.c = fkm.b("version", $$0, "");
         $$1.d = fkm.b("author", $$0, "");
         $$1.e = fkm.b("link", $$0, "");
         $$1.f = fkm.b("image", $$0, null);
         $$1.g = fkm.b("trailer", $$0, "");
         $$1.h = fkm.b("recommendedPlayers", $$0, "");
         $$1.i = fis.a.valueOf(fkm.b("type", $$0, fis.a.a.name()));
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
