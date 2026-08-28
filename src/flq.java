import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flq extends flo {
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
   public flq.a i = flq.a.a;

   public static flq a(JsonObject $$0) {
      flq $$1 = new flq();

      try {
         $$1.a = fnk.b("id", $$0, "");
         $$1.b = fnk.b("name", $$0, "");
         $$1.c = fnk.b("version", $$0, "");
         $$1.d = fnk.b("author", $$0, "");
         $$1.e = fnk.b("link", $$0, "");
         $$1.f = fnk.b("image", $$0, null);
         $$1.g = fnk.b("trailer", $$0, "");
         $$1.h = fnk.b("recommendedPlayers", $$0, "");
         $$1.i = flq.a.valueOf(fnk.b("type", $$0, flq.a.a.name()));
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
