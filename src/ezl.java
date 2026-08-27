import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezl extends ezj {
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
   public ezl.a i = ezl.a.a;

   public static ezl a(JsonObject $$0) {
      ezl $$1 = new ezl();

      try {
         $$1.a = fbg.b("id", $$0, "");
         $$1.b = fbg.b("name", $$0, "");
         $$1.c = fbg.b("version", $$0, "");
         $$1.d = fbg.b("author", $$0, "");
         $$1.e = fbg.b("link", $$0, "");
         $$1.f = fbg.b("image", $$0, null);
         $$1.g = fbg.b("trailer", $$0, "");
         $$1.h = fbg.b("recommendedPlayers", $$0, "");
         $$1.i = ezl.a.valueOf(fbg.b("type", $$0, ezl.a.a.name()));
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
