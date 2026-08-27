public class cpa extends cnx {
   public cpa(cnu $$0) {
      super($$0);
   }

   public boolean a(cgu $$0, crs $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         clb $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cuv.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cuv.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(ark.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cle.oC) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public clb a(cgu $$0, ip $$1) {
      clb $$2 = new clb(cle.vb, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         clb $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dcu $$5 = dcu.a($$4.d());
            if ($$5 != null) {
               cml.a($$2, $$5.b());
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
   public coj<?> aq_() {
      return coj.n;
   }
}
