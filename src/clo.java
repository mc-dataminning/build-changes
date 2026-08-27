public class clo extends clw {
   public clo(clt $$0) {
      super($$0);
   }

   public boolean a(ceu $$0, cpq $$1) {
      cho $$2 = null;
      cja $$3 = null;
      cja $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cja $$6 = $$0.a($$5);
         if (!$$6.b()) {
            civ $$7 = $$6.d();
            if (!($$7 instanceof cgq)) {
               return false;
            }

            cgq $$8 = (cgq)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = dcg.c($$6);
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

   public cja a(ceu $$0, hu $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cja $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = dcg.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cja.b;
   }

   public hp<cja> a(ceu $$0) {
      hp<cja> $$1 = hp.a($$0.b(), cja.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cja $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new cja($$3.d().s()));
            } else if ($$3.u() && dcg.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cmh<?> ai_() {
      return cmh.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
