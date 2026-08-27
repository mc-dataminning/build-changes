public class cpi extends cof {
   public cpi(coc $$0) {
      super($$0);
   }

   public boolean a(chc $$0, csa $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         clj $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cvc.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cvc.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(aro.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(clm.pn) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public clj a(chc $$0, ip $$1) {
      clj $$2 = new clj(clm.vM, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         clj $$4 = $$0.a($$3);
         if (!$$4.b()) {
            ddb $$5 = ddb.a($$4.d());
            if ($$5 != null) {
               cmt.a($$2, $$5.b());
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
   public cos<?> aq_() {
      return cos.n;
   }
}
