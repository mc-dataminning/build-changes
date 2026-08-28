import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcm extends fck {
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
   public fcm.a i = fcm.a.a;

   public static fcm a(JsonObject $$0) {
      fcm $$1 = new fcm();

      try {
         $$1.a = feh.b("id", $$0, "");
         $$1.b = feh.b("name", $$0, "");
         $$1.c = feh.b("version", $$0, "");
         $$1.d = feh.b("author", $$0, "");
         $$1.e = feh.b("link", $$0, "");
         $$1.f = feh.b("image", $$0, null);
         $$1.g = feh.b("trailer", $$0, "");
         $$1.h = feh.b("recommendedPlayers", $$0, "");
         $$1.i = fcm.a.valueOf(feh.b("type", $$0, fcm.a.a.name()));
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
