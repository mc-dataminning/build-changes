public class cwp {
   public static bsk a(dfm $$0, cou $$1, bsj $$2) {
      $$1.c($$2);
      return bsk.c;
   }

   public static cwm a(cwm $$0, cou $$1, cwm $$2, boolean $$3) {
      boolean $$4 = $$1.fT();
      if ($$3 && $$4) {
         if (!$$1.gg().i($$2)) {
            $$1.gg().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.f()) {
            return $$2;
         } else {
            if (!$$1.gg().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cwm a(cwm $$0, cou $$1, cwm $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(clc $$0, Iterable<cwm> $$1) {
      dfm $$2 = $$0.dV();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new clc($$2, $$0.dA(), $$0.dC(), $$0.dG(), $$2x)));
      }
   }
}
