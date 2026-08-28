import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fjr extends fjt {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fjr.a c = fjr.a.a;

   public static fjr a(String $$0) {
      fjr $$1 = new fjr();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = flp.a("startDate", $$3, 0L);
         $$1.b = flp.a("daysLeft", $$3, 0);
         $$1.c = b(flp.b("subscriptionType", $$3, fjr.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fjr.a b(String $$0) {
      try {
         return fjr.a.valueOf($$0);
      } catch (Exception var2) {
         return fjr.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
