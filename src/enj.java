import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class enj extends enl {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public enj.a c = enj.a.a;

   public static enj a(String $$0) {
      enj $$1 = new enj();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = epi.a("startDate", $$3, 0L);
         $$1.b = epi.a("daysLeft", $$3, 0);
         $$1.c = b(epi.a("subscriptionType", $$3, enj.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static enj.a b(String $$0) {
      try {
         return enj.a.valueOf($$0);
      } catch (Exception var2) {
         return enj.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
