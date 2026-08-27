import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eav extends eay {
   private static final Logger a = LogUtils.getLogger();
   final acq b;

   eav(eck[] $$0, acq $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eba b() {
      return ebb.A;
   }

   @Override
   public void a(dzv $$0) {
      dzm<eaz> $$1 = new dzm<>(dzp.b, this.b);
      if ($$0.a($$1)) {
         $$0.a("Function " + this.b + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown function table called " + this.b));
      }
   }

   @Override
   protected cfz a(cfz $$0, dzk $$1) {
      eaz $$2 = $$1.a().getElement(dzp.b, this.b);
      if ($$2 == null) {
         a.warn("Unknown function: {}", this.b);
         return $$0;
      } else {
         dzk.c<?> $$3 = dzk.a($$2);
         if ($$1.b($$3)) {
            cfz var5;
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

   public static eay.a<?> a(acq $$0) {
      return a($$1 -> new eav($$1, $$0));
   }

   public static class a extends eay.c<eav> {
      public void a(JsonObject $$0, eav $$1, JsonSerializationContext $$2) {
         $$0.addProperty("name", $$1.b.toString());
      }

      public eav a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         acq $$3 = new acq(aor.i($$0, "name"));
         return new eav($$2, $$3);
      }
   }
}
