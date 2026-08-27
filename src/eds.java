import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eds extends edv {
   private static final Logger a = LogUtils.getLogger();
   final aep b;

   eds(efh[] $$0, aep $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edx b() {
      return edy.A;
   }

   @Override
   public void a(ecs $$0) {
      ecj<edw> $$1 = new ecj<>(ecm.b, this.b);
      if ($$0.a($$1)) {
         $$0.a("Function " + this.b + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown function table called " + this.b));
      }
   }

   @Override
   protected ciw a(ciw $$0, ech $$1) {
      edw $$2 = $$1.a().getElement(ecm.b, this.b);
      if ($$2 == null) {
         a.warn("Unknown function: {}", this.b);
         return $$0;
      } else {
         ech.c<?> $$3 = ech.a($$2);
         if ($$1.b($$3)) {
            ciw var5;
            try {
               var5 = $$2.apply($$0, $$1);
            } finally {
               $$1.c($$3);
            }

            return var5;
         } else {
            a.warn("Detected infinite loop in loot tables");
            return $$0;
         }
      }
   }

   public static edv.a<?> a(aep $$0) {
      return a($$1 -> new eds($$1, $$0));
   }

   public static class a extends edv.c<eds> {
      public void a(JsonObject $$0, eds $$1, JsonSerializationContext $$2) {
         $$0.addProperty("name", $$1.b.toString());
      }

      public eds a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         aep $$3 = new aep(arf.i($$0, "name"));
         return new eds($$2, $$3);
      }
   }
}
