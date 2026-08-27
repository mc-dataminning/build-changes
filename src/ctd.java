public class ctd extends csk {
   public ctd(csi $$0) {
      super($$0);
   }

   public boolean a(clk $$0, cwe $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (czf.a($$5.d()) instanceof dgd) {
               $$2++;
            } else {
               if (!($$5.d() instanceof coh)) {
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

   public cpq a(clk $$0, iy $$1) {
      cpq $$2 = cpq.h;
      coh $$3 = (coh)cpt.rh;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cpl $$6 = $$5.d();
            if (czf.a($$6) instanceof dgd) {
               $$2 = $$5;
            } else if ($$6 instanceof coh) {
               $$3 = (coh)$$6;
            }
         }
      }

      czf $$7 = dgd.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csw<?> as_() {
      return csw.m;
   }
}
