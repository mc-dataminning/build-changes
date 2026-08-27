public class csq extends crx {
   public csq(crv $$0) {
      super($$0);
   }

   public boolean a(ckv $$0, cvr $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cys.a($$5.d()) instanceof dfq) {
               $$2++;
            } else {
               if (!($$5.d() instanceof cns)) {
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

   public cpd a(ckv $$0, iw $$1) {
      cpd $$2 = cpd.h;
      cns $$3 = (cns)cpg.rh;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         if (!$$5.b()) {
            coy $$6 = $$5.d();
            if (cys.a($$6) instanceof dfq) {
               $$2 = $$5;
            } else if ($$6 instanceof cns) {
               $$3 = (cns)$$6;
            }
         }
      }

      cpd $$7 = dfq.b($$3.d());
      if ($$2.v()) {
         $$7.c($$2.w().h());
      }

      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csj<?> at_() {
      return csj.m;
   }
}
