public class cqn extends cpu {
   public cqn(cps $$0) {
      super($$0);
   }

   public boolean a(cir $$0, ctp $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cwq.a($$5.d()) instanceof ddo) {
               $$2++;
            } else {
               if (!($$5.d() instanceof cln)) {
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

   public cmy a(cir $$0, iu $$1) {
      cmy $$2 = cmy.f;
      cln $$3 = (cln)cnb.rf;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cmt $$6 = $$5.d();
            if (cwq.a($$6) instanceof ddo) {
               $$2 = $$5;
            } else if ($$6 instanceof cln) {
               $$3 = (cln)$$6;
            }
         }
      }

      cmy $$7 = ddo.b($$3.d());
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
   public cqg<?> ar_() {
      return cqg.m;
   }
}
