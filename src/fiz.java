import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fiz extends fix {
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
   public fiz.a i = fiz.a.a;

   public static fiz a(JsonObject $$0) {
      fiz $$1 = new fiz();

      try {
         $$1.a = fkt.b("id", $$0, "");
         $$1.b = fkt.b("name", $$0, "");
         $$1.c = fkt.b("version", $$0, "");
         $$1.d = fkt.b("author", $$0, "");
         $$1.e = fkt.b("link", $$0, "");
         $$1.f = fkt.b("image", $$0, null);
         $$1.g = fkt.b("trailer", $$0, "");
         $$1.h = fkt.b("recommendedPlayers", $$0, "");
         $$1.i = fiz.a.valueOf(fkt.b("type", $$0, fiz.a.a.name()));
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
