public class cqx extends cpu {
   public cqx(cps $$0) {
      super($$0);
   }

   public boolean a(cir $$0, ctp $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cmy $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cws.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cws.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(asp.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cnb.pn) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cmy a(cir $$0, iu $$1) {
      cmy $$2 = new cmy(cnb.vN, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cmy $$4 = $$0.a($$3);
         if (!$$4.b()) {
            der $$5 = der.a($$4.d());
            if ($$5 != null) {
               coi.a($$2, $$5.b());
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
   public cqg<?> ar_() {
      return cqg.n;
   }
}
