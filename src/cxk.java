public class cxk {
   public static bsy a(dgz $$0, cpr $$1, bsx $$2) {
      $$1.c($$2);
      return bsy.c;
   }

   public static cxh a(cxh $$0, cpr $$1, cxh $$2, boolean $$3) {
      boolean $$4 = $$1.fX();
      if ($$3 && $$4) {
         if (!$$1.gl().i($$2)) {
            $$1.gl().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.f()) {
            return $$2;
         } else {
            if (!$$1.gl().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cxh a(cxh $$0, cpr $$1, cxh $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(clw $$0, Iterable<cxh> $$1) {
      dgz $$2 = $$0.dU();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new clw($$2, $$0.dz(), $$0.dB(), $$0.dF(), $$2x)));
      }
   }
}
