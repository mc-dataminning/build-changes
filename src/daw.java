public class daw extends dab {
   public daw(czy $$0) {
      super($$0);
   }

   public boolean a(czz $$0, dej $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (dhm.a($$5.h()) instanceof dom) {
               $$2++;
            } else {
               if (!($$5.h() instanceof cun)) {
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

   public cvs a(czz $$0, jq.a $$1) {
      cvs $$2 = cvs.k;
      cun $$3 = (cun)cvw.rj;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         if (!$$5.f()) {
            cvn $$6 = $$5.h();
            if (dhm.a($$6) instanceof dom) {
               $$2 = $$5;
            } else if ($$6 instanceof cun) {
               $$3 = (cun)$$6;
            }
         }
      }

      dhm $$7 = dom.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dap<?> ar_() {
      return dap.m;
   }
}
