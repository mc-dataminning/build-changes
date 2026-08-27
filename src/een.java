import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import org.slf4j.Logger;

public class een extends edv {
   private static final Logger a = LogUtils.getLogger();

   een(efh[] $$0) {
      super($$0);
   }

   @Override
   public edx b() {
      return edy.g;
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cml> $$2 = $$1.d().q().a(cmc.b, new bgv($$0), $$1.d());
         if ($$2.isPresent()) {
            ciw $$3 = $$2.get().a($$1.d().B_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         a.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static edv.a<?> c() {
      return a(een::new);
   }

   public static class a extends edv.c<een> {
      public een a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         return new een($$2);
      }
   }
}
