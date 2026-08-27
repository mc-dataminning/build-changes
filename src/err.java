import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class err extends erp {
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
   public err.a i = err.a.a;

   public static err a(JsonObject $$0) {
      err $$1 = new err();

      try {
         $$1.a = etm.b("id", $$0, "");
         $$1.b = etm.b("name", $$0, "");
         $$1.c = etm.b("version", $$0, "");
         $$1.d = etm.b("author", $$0, "");
         $$1.e = etm.b("link", $$0, "");
         $$1.f = etm.b("image", $$0, null);
         $$1.g = etm.b("trailer", $$0, "");
         $$1.h = etm.b("recommendedPlayers", $$0, "");
         $$1.i = err.a.valueOf(etm.b("type", $$0, err.a.a.name()));
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
