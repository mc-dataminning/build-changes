import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbx extends fbv {
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
   public fbx.a i = fbx.a.a;

   public static fbx a(JsonObject $$0) {
      fbx $$1 = new fbx();

      try {
         $$1.a = fds.b("id", $$0, "");
         $$1.b = fds.b("name", $$0, "");
         $$1.c = fds.b("version", $$0, "");
         $$1.d = fds.b("author", $$0, "");
         $$1.e = fds.b("link", $$0, "");
         $$1.f = fds.b("image", $$0, null);
         $$1.g = fds.b("trailer", $$0, "");
         $$1.h = fds.b("recommendedPlayers", $$0, "");
         $$1.i = fbx.a.valueOf(fds.b("type", $$0, fbx.a.a.name()));
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
