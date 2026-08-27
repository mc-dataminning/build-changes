import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import org.slf4j.Logger;

public class ebq extends eay {
   private static final Logger a = LogUtils.getLogger();

   ebq(eck[] $$0) {
      super($$0);
   }

   @Override
   public eba b() {
      return ebb.g;
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cjo> $$2 = $$1.d().q().a(cjf.b, new bee($$0), $$1.d());
         if ($$2.isPresent()) {
            cfz $$3 = $$2.get().a($$1.d().B_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         a.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eay.a<?> c() {
      return a(ebq::new);
   }

   public static class a extends eay.c<ebq> {
      public ebq a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         return new ebq($$2);
      }
   }
}
