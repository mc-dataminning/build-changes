import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class enb extends end {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public enb.a c = enb.a.a;

   public static enb a(String $$0) {
      enb $$1 = new enb();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = epa.a("startDate", $$3, 0L);
         $$1.b = epa.a("daysLeft", $$3, 0);
         $$1.c = b(epa.a("subscriptionType", $$3, enb.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static enb.a b(String $$0) {
      try {
         return enb.a.valueOf($$0);
      } catch (Exception var2) {
         return enb.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
