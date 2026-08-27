import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ene extends eng {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public ene.a c = ene.a.a;

   public static ene a(String $$0) {
      ene $$1 = new ene();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = epd.a("startDate", $$3, 0L);
         $$1.b = epd.a("daysLeft", $$3, 0);
         $$1.c = b(epd.a("subscriptionType", $$3, ene.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static ene.a b(String $$0) {
      try {
         return ene.a.valueOf($$0);
      } catch (Exception var2) {
         return ene.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
