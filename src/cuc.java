public class cuc {
   public static bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      $$1.c($$2);
      return bqe.b($$1.b($$2));
   }

   public static cua a(cua $$0, cmh $$1, cua $$2, boolean $$3) {
      boolean $$4 = $$1.fL();
      if ($$3 && $$4) {
         if (!$$1.fY().i($$2)) {
            $$1.fY().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.e()) {
            return $$2;
         } else {
            if (!$$1.fY().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cua a(cua $$0, cmh $$1, cua $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cir $$0, Iterable<cua> $$1) {
      dcd $$2 = $$0.dP();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cir($$2, $$0.du(), $$0.dw(), $$0.dA(), $$2x)));
      }
   }
}
