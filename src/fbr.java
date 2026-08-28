import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbr extends fbp {
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
   public fbr.a i = fbr.a.a;

   public static fbr a(JsonObject $$0) {
      fbr $$1 = new fbr();

      try {
         $$1.a = fdm.b("id", $$0, "");
         $$1.b = fdm.b("name", $$0, "");
         $$1.c = fdm.b("version", $$0, "");
         $$1.d = fdm.b("author", $$0, "");
         $$1.e = fdm.b("link", $$0, "");
         $$1.f = fdm.b("image", $$0, null);
         $$1.g = fdm.b("trailer", $$0, "");
         $$1.h = fdm.b("recommendedPlayers", $$0, "");
         $$1.i = fbr.a.valueOf(fdm.b("type", $$0, fbr.a.a.name()));
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
