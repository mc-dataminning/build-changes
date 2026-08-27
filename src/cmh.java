public class cmh extends clr {
   public cmh(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (csk.a($$5.d()) instanceof czj) {
               $$2++;
            } else {
               if (!($$5.d() instanceof chl)) {
                  return false;
               }

               $$3++;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public ciw a(ceq $$0, ht $$1) {
      ciw $$2 = ciw.b;
      chl $$3 = (chl)ciz.qu;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cir $$6 = $$5.d();
            if (csk.a($$6) instanceof czj) {
               $$2 = $$5;
            } else if ($$6 instanceof chl) {
               $$3 = (chl)$$6;
            }
         }
      }

      ciw $$7 = czj.b($$3.d());
      if ($$2.u()) {
         $$7.c($$2.v().h());
      }

      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.m;
   }
}
