import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eob extends eod {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public eob.a c = eob.a.a;

   public static eob a(String $$0) {
      eob $$1 = new eob();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = eqa.a("startDate", $$3, 0L);
         $$1.b = eqa.a("daysLeft", $$3, 0);
         $$1.c = b(eqa.a("subscriptionType", $$3, eob.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static eob.a b(String $$0) {
      try {
         return eob.a.valueOf($$0);
      } catch (Exception var2) {
         return eob.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
