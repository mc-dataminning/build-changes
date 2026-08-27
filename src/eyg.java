import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eyg extends eye {
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
   public eyg.a i = eyg.a.a;

   public static eyg a(JsonObject $$0) {
      eyg $$1 = new eyg();

      try {
         $$1.a = fab.b("id", $$0, "");
         $$1.b = fab.b("name", $$0, "");
         $$1.c = fab.b("version", $$0, "");
         $$1.d = fab.b("author", $$0, "");
         $$1.e = fab.b("link", $$0, "");
         $$1.f = fab.b("image", $$0, null);
         $$1.g = fab.b("trailer", $$0, "");
         $$1.h = fab.b("recommendedPlayers", $$0, "");
         $$1.i = eyg.a.valueOf(fab.b("type", $$0, eyg.a.a.name()));
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
