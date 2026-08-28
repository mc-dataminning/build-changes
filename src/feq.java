import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class feq extends feo {
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
   public feq.a i = feq.a.a;

   public static feq a(JsonObject $$0) {
      feq $$1 = new feq();

      try {
         $$1.a = fgl.b("id", $$0, "");
         $$1.b = fgl.b("name", $$0, "");
         $$1.c = fgl.b("version", $$0, "");
         $$1.d = fgl.b("author", $$0, "");
         $$1.e = fgl.b("link", $$0, "");
         $$1.f = fgl.b("image", $$0, null);
         $$1.g = fgl.b("trailer", $$0, "");
         $$1.h = fgl.b("recommendedPlayers", $$0, "");
         $$1.i = feq.a.valueOf(fgl.b("type", $$0, feq.a.a.name()));
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
