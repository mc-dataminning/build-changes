import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbq extends fbs {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fbq.a c = fbq.a.a;

   public static fbq a(String $$0) {
      fbq $$1 = new fbq();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fdp.a("startDate", $$3, 0L);
         $$1.b = fdp.a("daysLeft", $$3, 0);
         $$1.c = b(fdp.b("subscriptionType", $$3, fbq.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fbq.a b(String $$0) {
      try {
         return fbq.a.valueOf($$0);
      } catch (Exception var2) {
         return fbq.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
