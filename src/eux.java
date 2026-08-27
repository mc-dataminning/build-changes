import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eux extends euz {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public eux.a c = eux.a.a;

   public static eux a(String $$0) {
      eux $$1 = new eux();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = eww.a("startDate", $$3, 0L);
         $$1.b = eww.a("daysLeft", $$3, 0);
         $$1.c = b(eww.b("subscriptionType", $$3, eux.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static eux.a b(String $$0) {
      try {
         return eux.a.valueOf($$0);
      } catch (Exception var2) {
         return eux.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
