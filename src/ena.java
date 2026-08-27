import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ena extends enc {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public ena.a c = ena.a.a;

   public static ena a(String $$0) {
      ena $$1 = new ena();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = eoz.a("startDate", $$3, 0L);
         $$1.b = eoz.a("daysLeft", $$3, 0);
         $$1.c = b(eoz.a("subscriptionType", $$3, ena.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static ena.a b(String $$0) {
      try {
         return ena.a.valueOf($$0);
      } catch (Exception var2) {
         return ena.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
