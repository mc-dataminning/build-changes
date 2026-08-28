import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmf extends fmd {
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
   public fmf.a i = fmf.a.a;

   public static fmf a(JsonObject $$0) {
      fmf $$1 = new fmf();

      try {
         $$1.a = fnz.b("id", $$0, "");
         $$1.b = fnz.b("name", $$0, "");
         $$1.c = fnz.b("version", $$0, "");
         $$1.d = fnz.b("author", $$0, "");
         $$1.e = fnz.b("link", $$0, "");
         $$1.f = fnz.b("image", $$0, null);
         $$1.g = fnz.b("trailer", $$0, "");
         $$1.h = fnz.b("recommendedPlayers", $$0, "");
         $$1.i = fmf.a.valueOf(fnz.b("type", $$0, fmf.a.a.name()));
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
