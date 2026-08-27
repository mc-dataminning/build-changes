public class csd extends crx {
   public csd(crv $$0) {
      super($$0);
   }

   public boolean a(ckv $$0, cvr $$1) {
      int $$2 = 0;
      cpd $$3 = cpd.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cpg.rT)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpg.uf)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cpd a(ckv $$0, iw $$1) {
      int $$2 = 0;
      cpd $$3 = cpd.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cpg.rT)) {
               if (!$$3.b()) {
                  return cpd.h;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpg.uf)) {
                  return cpd.h;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cpd.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public csj<?> at_() {
      return csj.e;
   }
}
