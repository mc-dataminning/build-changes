import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbr extends fbt {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fbr.a c = fbr.a.a;

   public static fbr a(String $$0) {
      fbr $$1 = new fbr();

      try {
         JsonParser $$2 = new JsonParser();
         JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
         $$1.a = fdq.a("startDate", $$3, 0L);
         $$1.b = fdq.a("daysLeft", $$3, 0);
         $$1.c = b(fdq.b("subscriptionType", $$3, fbr.a.a.name()));
      } catch (Exception var4) {
         d.error("Could not parse Subscription: {}", var4.getMessage());
      }

      return $$1;
   }

   private static fbr.a b(String $$0) {
      try {
         return fbr.a.valueOf($$0);
      } catch (Exception var2) {
         return fbr.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
