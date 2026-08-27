import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class etu extends etw {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public etu.a c = etu.a.a;

   public static etu a(String $$0) {
      etu $$1 = new etu();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = evt.a("startDate", $$3, 0L);
         $$1.b = evt.a("daysLeft", $$3, 0);
         $$1.c = b(evt.b("subscriptionType", $$3, etu.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static etu.a b(String $$0) {
      try {
         return etu.a.valueOf($$0);
      } catch (Exception var2) {
         return etu.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
