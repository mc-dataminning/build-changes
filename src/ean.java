import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class ean extends eay {
   ean(eck[] $$0) {
      super($$0);
   }

   @Override
   public eba b() {
      return ebb.s;
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      Float $$2 = $$1.c(ebw.j);
      if ($$2 != null) {
         apf $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.L();
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            if ($$3.i() <= $$4) {
               $$6++;
            }
         }

         $$0.f($$6);
      }

      return $$0;
   }

   public static eay.a<?> c() {
      return a(ean::new);
   }

   public static class a extends eay.c<ean> {
      public ean a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         return new ean($$2);
      }
   }
}
