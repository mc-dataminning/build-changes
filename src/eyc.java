import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eyc extends eye {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public eyc.a c = eyc.a.a;

   public static eyc a(String $$0) {
      eyc $$1 = new eyc();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fab.a("startDate", $$3, 0L);
         $$1.b = fab.a("daysLeft", $$3, 0);
         $$1.c = b(fab.b("subscriptionType", $$3, eyc.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static eyc.a b(String $$0) {
      try {
         return eyc.a.valueOf($$0);
      } catch (Exception var2) {
         return eyc.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
