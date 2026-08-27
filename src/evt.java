import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class evt extends evv {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public evt.a c = evt.a.a;

   public static evt a(String $$0) {
      evt $$1 = new evt();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = exs.a("startDate", $$3, 0L);
         $$1.b = exs.a("daysLeft", $$3, 0);
         $$1.c = b(exs.b("subscriptionType", $$3, evt.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static evt.a b(String $$0) {
      try {
         return evt.a.valueOf($$0);
      } catch (Exception var2) {
         return evt.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
