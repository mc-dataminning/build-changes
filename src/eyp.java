import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eyp extends eyn {
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
   public eyp.a i = eyp.a.a;

   public static eyp a(JsonObject $$0) {
      eyp $$1 = new eyp();

      try {
         $$1.a = fak.b("id", $$0, "");
         $$1.b = fak.b("name", $$0, "");
         $$1.c = fak.b("version", $$0, "");
         $$1.d = fak.b("author", $$0, "");
         $$1.e = fak.b("link", $$0, "");
         $$1.f = fak.b("image", $$0, null);
         $$1.g = fak.b("trailer", $$0, "");
         $$1.h = fak.b("recommendedPlayers", $$0, "");
         $$1.i = eyp.a.valueOf(fak.b("type", $$0, eyp.a.a.name()));
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
