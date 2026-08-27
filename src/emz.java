import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emz extends enb {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public emz.a c = emz.a.a;

   public static emz a(String $$0) {
      emz $$1 = new emz();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = eoy.a("startDate", $$3, 0L);
         $$1.b = eoy.a("daysLeft", $$3, 0);
         $$1.c = b(eoy.a("subscriptionType", $$3, emz.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static emz.a b(String $$0) {
      try {
         return emz.a.valueOf($$0);
      } catch (Exception var2) {
         return emz.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
