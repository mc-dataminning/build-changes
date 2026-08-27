import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class enl extends enn {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public enl.a c = enl.a.a;

   public static enl a(String $$0) {
      enl $$1 = new enl();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = epk.a("startDate", $$3, 0L);
         $$1.b = epk.a("daysLeft", $$3, 0);
         $$1.c = b(epk.a("subscriptionType", $$3, enl.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static enl.a b(String $$0) {
      try {
         return enl.a.valueOf($$0);
      } catch (Exception var2) {
         return enl.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
