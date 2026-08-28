import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fix extends fiv {
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
   public fix.a i = fix.a.a;

   public static fix a(JsonObject $$0) {
      fix $$1 = new fix();

      try {
         $$1.a = fkr.b("id", $$0, "");
         $$1.b = fkr.b("name", $$0, "");
         $$1.c = fkr.b("version", $$0, "");
         $$1.d = fkr.b("author", $$0, "");
         $$1.e = fkr.b("link", $$0, "");
         $$1.f = fkr.b("image", $$0, null);
         $$1.g = fkr.b("trailer", $$0, "");
         $$1.h = fkr.b("recommendedPlayers", $$0, "");
         $$1.i = fix.a.valueOf(fkr.b("type", $$0, fix.a.a.name()));
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
