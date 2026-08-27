public class cvu extends cvb {
   public cvu(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if (dby.a($$5.f()) instanceof diw) {
               $$2++;
            } else {
               if (!($$5.f() instanceof cqd)) {
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

   public crj a(cnf $$0, iz $$1) {
      crj $$2 = crj.i;
      cqd $$3 = (cqd)crm.rh;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            cre $$6 = $$5.f();
            if (dby.a($$6) instanceof diw) {
               $$2 = $$5;
            } else if ($$6 instanceof cqd) {
               $$3 = (cqd)$$6;
            }
         }
      }

      dby $$7 = diw.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvn<?> ap_() {
      return cvn.m;
   }
}
