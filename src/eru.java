import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eru extends erw {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public eru.a c = eru.a.a;

   public static eru a(String $$0) {
      eru $$1 = new eru();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = ett.a("startDate", $$3, 0L);
         $$1.b = ett.a("daysLeft", $$3, 0);
         $$1.c = b(ett.b("subscriptionType", $$3, eru.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static eru.a b(String $$0) {
      try {
         return eru.a.valueOf($$0);
      } catch (Exception var2) {
         return eru.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
