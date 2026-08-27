public class cta extends cth {
   public cta(ctf $$0) {
      super($$0);
   }

   public boolean a(cmg $$0, cxb $$1) {
      cpd $$2 = null;
      cqm $$3 = null;
      cqm $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cqm $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cqh $$7 = $$6.d();
            if (!($$7 instanceof coe)) {
               return false;
            }

            coe $$8 = (coe)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = djy.c($$6);
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

   public cqm a(cmg $$0, iz $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cqm $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = djy.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cqm.h;
   }

   public iu<cqm> a(cmg $$0) {
      iu<cqm> $$1 = iu.a($$0.b(), cqm.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cqm $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().u()) {
               $$1.set($$2, new cqm($$3.d().t()));
            } else if (djy.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public ctt<?> ar_() {
      return ctt.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
