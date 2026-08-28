import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgq extends fgo {
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
   public fgq.a i = fgq.a.a;

   public static fgq a(JsonObject $$0) {
      fgq $$1 = new fgq();

      try {
         $$1.a = fik.b("id", $$0, "");
         $$1.b = fik.b("name", $$0, "");
         $$1.c = fik.b("version", $$0, "");
         $$1.d = fik.b("author", $$0, "");
         $$1.e = fik.b("link", $$0, "");
         $$1.f = fik.b("image", $$0, null);
         $$1.g = fik.b("trailer", $$0, "");
         $$1.h = fik.b("recommendedPlayers", $$0, "");
         $$1.i = fgq.a.valueOf(fik.b("type", $$0, fgq.a.a.name()));
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
