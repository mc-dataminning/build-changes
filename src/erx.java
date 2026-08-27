import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erx extends erv {
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
   public erx.a i = erx.a.a;

   public static erx a(JsonObject $$0) {
      erx $$1 = new erx();

      try {
         $$1.a = ets.b("id", $$0, "");
         $$1.b = ets.b("name", $$0, "");
         $$1.c = ets.b("version", $$0, "");
         $$1.d = ets.b("author", $$0, "");
         $$1.e = ets.b("link", $$0, "");
         $$1.f = ets.b("image", $$0, null);
         $$1.g = ets.b("trailer", $$0, "");
         $$1.h = ets.b("recommendedPlayers", $$0, "");
         $$1.i = erx.a.valueOf(ets.b("type", $$0, erx.a.a.name()));
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
