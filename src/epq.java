import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epq extends eps {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public epq.a c = epq.a.a;

   public static epq a(String $$0) {
      epq $$1 = new epq();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = erp.a("startDate", $$3, 0L);
         $$1.b = erp.a("daysLeft", $$3, 0);
         $$1.c = b(erp.b("subscriptionType", $$3, epq.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static epq.a b(String $$0) {
      try {
         return epq.a.valueOf($$0);
      } catch (Exception var2) {
         return epq.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
