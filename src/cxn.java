public class cxn {
   public static bte a(dha $$0, cps $$1, btd $$2) {
      $$1.c($$2);
      return bte.c;
   }

   public static cxk a(cxk $$0, cps $$1, cxk $$2, boolean $$3) {
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

   public static cxk a(cxk $$0, cps $$1, cxk $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(clw $$0, Iterable<cxk> $$1) {
      dha $$2 = $$0.dV();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new clw($$2, $$0.dA(), $$0.dC(), $$0.dG(), $$2x)));
      }
   }
}
