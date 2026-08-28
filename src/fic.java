import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fic extends fia {
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
   public fic.a i = fic.a.a;

   public static fic a(JsonObject $$0) {
      fic $$1 = new fic();

      try {
         $$1.a = fjw.b("id", $$0, "");
         $$1.b = fjw.b("name", $$0, "");
         $$1.c = fjw.b("version", $$0, "");
         $$1.d = fjw.b("author", $$0, "");
         $$1.e = fjw.b("link", $$0, "");
         $$1.f = fjw.b("image", $$0, null);
         $$1.g = fjw.b("trailer", $$0, "");
         $$1.h = fjw.b("recommendedPlayers", $$0, "");
         $$1.i = fic.a.valueOf(fjw.b("type", $$0, fic.a.a.name()));
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
