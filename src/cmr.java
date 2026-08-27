public class cmr extends clr {
   public cmr(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         ciw $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(csl.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(csl.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(apr.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(ciz.oC) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public ciw a(ceq $$0, ht $$1) {
      ciw $$2 = new ciw(ciz.va, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         ciw $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dan $$5 = dan.a($$4.d());
            if ($$5 != null) {
               ckg.a($$2, $$5.a(), $$5.b());
               break;
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.n;
   }
}
