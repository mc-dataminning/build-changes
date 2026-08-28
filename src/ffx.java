import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffx extends ffv {
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
   public ffx.a i = ffx.a.a;

   public static ffx a(JsonObject $$0) {
      ffx $$1 = new ffx();

      try {
         $$1.a = fhs.b("id", $$0, "");
         $$1.b = fhs.b("name", $$0, "");
         $$1.c = fhs.b("version", $$0, "");
         $$1.d = fhs.b("author", $$0, "");
         $$1.e = fhs.b("link", $$0, "");
         $$1.f = fhs.b("image", $$0, null);
         $$1.g = fhs.b("trailer", $$0, "");
         $$1.h = fhs.b("recommendedPlayers", $$0, "");
         $$1.i = ffx.a.valueOf(fhs.b("type", $$0, ffx.a.a.name()));
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
