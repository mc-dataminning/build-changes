import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class end extends enf {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public end.a c = end.a.a;

   public static end a(String $$0) {
      end $$1 = new end();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = epc.a("startDate", $$3, 0L);
         $$1.b = epc.a("daysLeft", $$3, 0);
         $$1.c = b(epc.a("subscriptionType", $$3, end.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static end.a b(String $$0) {
      try {
         return end.a.valueOf($$0);
      } catch (Exception var2) {
         return end.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
