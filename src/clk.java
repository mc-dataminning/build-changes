public class clk extends clr {
   public clk(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      chk $$2 = null;
      ciw $$3 = null;
      ciw $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         ciw $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cir $$7 = $$6.d();
            if (!($$7 instanceof cgm)) {
               return false;
            }

            cgm $$8 = (cgm)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = dca.c($$6);
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public ciw a(ceq $$0, ht $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         ciw $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = dca.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return ciw.b;
   }

   public ho<ciw> a(ceq $$0) {
      ho<ciw> $$1 = ho.a($$0.b(), ciw.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ciw $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new ciw($$3.d().s()));
            } else if ($$3.u() && dca.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
