import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epu extends eps {
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
   public epu.a i = epu.a.a;

   public static epu a(JsonObject $$0) {
      epu $$1 = new epu();

      try {
         $$1.a = erp.b("id", $$0, "");
         $$1.b = erp.b("name", $$0, "");
         $$1.c = erp.b("version", $$0, "");
         $$1.d = erp.b("author", $$0, "");
         $$1.e = erp.b("link", $$0, "");
         $$1.f = erp.b("image", $$0, null);
         $$1.g = erp.b("trailer", $$0, "");
         $$1.h = erp.b("recommendedPlayers", $$0, "");
         $$1.i = epu.a.valueOf(erp.b("type", $$0, epu.a.a.name()));
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
