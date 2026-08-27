public class cua extends cth {
   public cua(ctf $$0) {
      super($$0);
   }

   public boolean a(cmg $$0, cxb $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (dac.a($$5.d()) instanceof dha) {
               $$2++;
            } else {
               if (!($$5.d() instanceof cpe)) {
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

   public cqm a(cmg $$0, iz $$1) {
      cqm $$2 = cqm.h;
      cpe $$3 = (cpe)cqp.rh;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cqh $$6 = $$5.d();
            if (dac.a($$6) instanceof dha) {
               $$2 = $$5;
            } else if ($$6 instanceof cpe) {
               $$3 = (cpe)$$6;
            }
         }
      }

      dac $$7 = dha.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public ctt<?> ar_() {
      return ctt.m;
   }
}
