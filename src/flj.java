import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flj extends flh {
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
   public flj.a i = flj.a.a;

   public static flj a(JsonObject $$0) {
      flj $$1 = new flj();

      try {
         $$1.a = fnd.b("id", $$0, "");
         $$1.b = fnd.b("name", $$0, "");
         $$1.c = fnd.b("version", $$0, "");
         $$1.d = fnd.b("author", $$0, "");
         $$1.e = fnd.b("link", $$0, "");
         $$1.f = fnd.b("image", $$0, null);
         $$1.g = fnd.b("trailer", $$0, "");
         $$1.h = fnd.b("recommendedPlayers", $$0, "");
         $$1.i = flj.a.valueOf(fnd.b("type", $$0, flj.a.a.name()));
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
