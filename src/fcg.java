import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fcg extends fci {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fcg.a c = fcg.a.a;

   public static fcg a(String $$0) {
      fcg $$1 = new fcg();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fef.a("startDate", $$3, 0L);
         $$1.b = fef.a("daysLeft", $$3, 0);
         $$1.c = b(fef.b("subscriptionType", $$3, fcg.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fcg.a b(String $$0) {
      try {
         return fcg.a.valueOf($$0);
      } catch (Exception var2) {
         return fcg.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
