public class clt extends cmb {
   public clt(cly $$0) {
      super($$0);
   }

   public boolean a(cez $$0, cpv $$1) {
      cht $$2 = null;
      cjf $$3 = null;
      cjf $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cjf $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cja $$7 = $$6.d();
            if (!($$7 instanceof cgv)) {
               return false;
            }

            cgv $$8 = (cgv)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = dcl.c($$6);
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

   public cjf a(cez $$0, hu $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cjf $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = dcl.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cjf.b;
   }

   public hp<cjf> a(cez $$0) {
      hp<cjf> $$1 = hp.a($$0.b(), cjf.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cjf $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new cjf($$3.d().s()));
            } else if ($$3.u() && dcl.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cmm<?> an_() {
      return cmm.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
