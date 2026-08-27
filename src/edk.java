import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class edk extends edv {
   edk(efh[] $$0) {
      super($$0);
   }

   @Override
   public edx b() {
      return edy.s;
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      Float $$2 = $$1.c(eet.j);
      if ($$2 != null) {
         art $$3 = $$1.b();
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

   public static edv.a<?> c() {
      return a(edk::new);
   }

   public static class a extends edv.c<edk> {
      public edk a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         return new edk($$2);
      }
   }
}
