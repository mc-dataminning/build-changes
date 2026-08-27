import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eez implements efh {
   private static final Logger a = LogUtils.getLogger();
   final aep b;

   eez(aep $$0) {
      this.b = $$0;
   }

   @Override
   public efi b() {
      return efj.p;
   }

   @Override
   public void a(ecs $$0) {
      ecj<efh> $$1 = new ecj<>(ecm.a, this.b);
      if ($$0.a($$1)) {
         $$0.a("Condition " + this.b + " is recursively called");
      } else {
         efh.super.a($$0);
         $$0.b()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown condition table called " + this.b));
      }
   }

   public boolean a(ech $$0) {
      efh $$1 = $$0.a().getElement(ecm.a, this.b);
      if ($$1 == null) {
         a.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         ech.c<?> $$2 = ech.a($$1);
         if ($$0.b($$2)) {
            boolean var4;
            try {
               var4 = $$1.test($$0);
            } finally {
               $$0.c($$2);
            }

            return var4;
         } else {
            a.warn("Detected infinite loop in loot tables");
            return false;
         }
      }
   }

   public static efh.a a(aep $$0) {
      return () -> new eez($$0);
   }

   public static class a implements ecq<eez> {
      public void a(JsonObject $$0, eez $$1, JsonSerializationContext $$2) {
         $$0.addProperty("name", $$1.b.toString());
      }

      public eez b(JsonObject $$0, JsonDeserializationContext $$1) {
         aep $$2 = new aep(arf.i($$0, "name"));
         return new eez($$2);
      }
   }
}
