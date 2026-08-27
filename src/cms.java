public class cms extends clr {
   public cms(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               ciw $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(ciz.ux)) {
                     return false;
                  }
               } else if (!$$4.a(ciz.nH)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public ciw a(ceq $$0, ht $$1) {
      ciw $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(ciz.ux)) {
         return ciw.b;
      } else {
         ciw $$3 = new ciw(ciz.uw, 8);
         ckv.a($$3, ckv.d($$2));
         ckv.a($$3, ckv.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.j;
   }
}
