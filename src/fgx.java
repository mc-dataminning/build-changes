import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgx extends fgv {
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
   public fgx.a i = fgx.a.a;

   public static fgx a(JsonObject $$0) {
      fgx $$1 = new fgx();

      try {
         $$1.a = fir.b("id", $$0, "");
         $$1.b = fir.b("name", $$0, "");
         $$1.c = fir.b("version", $$0, "");
         $$1.d = fir.b("author", $$0, "");
         $$1.e = fir.b("link", $$0, "");
         $$1.f = fir.b("image", $$0, null);
         $$1.g = fir.b("trailer", $$0, "");
         $$1.h = fir.b("recommendedPlayers", $$0, "");
         $$1.i = fgx.a.valueOf(fir.b("type", $$0, fgx.a.a.name()));
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
