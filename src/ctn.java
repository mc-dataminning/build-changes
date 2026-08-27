public class ctn extends csk {
   public ctn(csi $$0) {
      super($$0);
   }

   public boolean a(clk $$0, cwe $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cpq $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(czh.cf.l()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(czh.cg.l()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(aum.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cpt.pp) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cpq a(clk $$0, iy $$1) {
      cpq $$2 = new cpq(cpt.vQ, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cpq $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dhg $$5 = dhg.a($$4.d());
            if ($$5 != null) {
               cra.a($$2, $$5.b());
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
   public csw<?> as_() {
      return csw.n;
   }
}
