public class cqg extends cpn {
   public cqg(cpl $$0) {
      super($$0);
   }

   public boolean a(cik $$0, cti $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cwj.a($$5.d()) instanceof ddh) {
               $$2++;
            } else {
               if (!($$5.d() instanceof clg)) {
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

   public cmr a(cik $$0, iu $$1) {
      cmr $$2 = cmr.f;
      clg $$3 = (clg)cmu.rf;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cmm $$6 = $$5.d();
            if (cwj.a($$6) instanceof ddh) {
               $$2 = $$5;
            } else if ($$6 instanceof clg) {
               $$3 = (clg)$$6;
            }
         }
      }

      cmr $$7 = ddh.b($$3.d());
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
   public cpz<?> ar_() {
      return cpz.m;
   }
}
