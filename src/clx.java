public class clx extends clr {
   public clx(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      int $$2 = 0;
      ciw $$3 = ciw.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(ciz.rf)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ciz.tp)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public ciw a(ceq $$0, ht $$1) {
      int $$2 = 0;
      ciw $$3 = ciw.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(ciz.rf)) {
               if (!$$3.b()) {
                  return ciw.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ciz.tp)) {
                  return ciw.b;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : ciw.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.e;
   }
}
