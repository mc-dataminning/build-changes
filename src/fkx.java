import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkx extends fkv {
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
   public fkx.a i = fkx.a.a;

   public static fkx a(JsonObject $$0) {
      fkx $$1 = new fkx();

      try {
         $$1.a = fmr.b("id", $$0, "");
         $$1.b = fmr.b("name", $$0, "");
         $$1.c = fmr.b("version", $$0, "");
         $$1.d = fmr.b("author", $$0, "");
         $$1.e = fmr.b("link", $$0, "");
         $$1.f = fmr.b("image", $$0, null);
         $$1.g = fmr.b("trailer", $$0, "");
         $$1.h = fmr.b("recommendedPlayers", $$0, "");
         $$1.i = fkx.a.valueOf(fmr.b("type", $$0, fkx.a.a.name()));
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
