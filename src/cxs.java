public class cxs extends cxm {
   public cxs(cxk $$0) {
      super($$0);
   }

   public boolean a(cpj $$0, dax $$1) {
      int $$2 = 0;
      cto $$3 = cto.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(ctr.rU)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctr.uj)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cto a(cpj $$0, iz.a $$1) {
      int $$2 = 0;
      cto $$3 = cto.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(ctr.rU)) {
               if (!$$3.e()) {
                  return cto.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctr.uj)) {
                  return cto.i;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 >= 1 ? $$3.c($$2 + 1) : cto.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cxy<?> ao_() {
      return cxy.e;
   }
}
