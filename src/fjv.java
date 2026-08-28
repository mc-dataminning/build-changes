import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjv extends fjt {
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
   public fjv.a i = fjv.a.a;

   public static fjv a(JsonObject $$0) {
      fjv $$1 = new fjv();

      try {
         $$1.a = flp.b("id", $$0, "");
         $$1.b = flp.b("name", $$0, "");
         $$1.c = flp.b("version", $$0, "");
         $$1.d = flp.b("author", $$0, "");
         $$1.e = flp.b("link", $$0, "");
         $$1.f = flp.b("image", $$0, null);
         $$1.g = flp.b("trailer", $$0, "");
         $$1.h = flp.b("recommendedPlayers", $$0, "");
         $$1.i = fjv.a.valueOf(flp.b("type", $$0, fjv.a.a.name()));
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
