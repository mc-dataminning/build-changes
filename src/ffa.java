import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffa extends fey {
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
   public ffa.a i = ffa.a.a;

   public static ffa a(JsonObject $$0) {
      ffa $$1 = new ffa();

      try {
         $$1.a = fgv.b("id", $$0, "");
         $$1.b = fgv.b("name", $$0, "");
         $$1.c = fgv.b("version", $$0, "");
         $$1.d = fgv.b("author", $$0, "");
         $$1.e = fgv.b("link", $$0, "");
         $$1.f = fgv.b("image", $$0, null);
         $$1.g = fgv.b("trailer", $$0, "");
         $$1.h = fgv.b("recommendedPlayers", $$0, "");
         $$1.i = ffa.a.valueOf(fgv.b("type", $$0, ffa.a.a.name()));
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
