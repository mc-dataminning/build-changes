public class cxu extends cxo {
   public cxu(cxm $$0) {
      super($$0);
   }

   public boolean a(cpl $$0, daz $$1) {
      int $$2 = 0;
      ctq $$3 = ctq.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(ctt.rU)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctt.uj)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public ctq a(cpl $$0, iz.a $$1) {
      int $$2 = 0;
      ctq $$3 = ctq.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(ctt.rU)) {
               if (!$$3.e()) {
                  return ctq.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctt.uj)) {
                  return ctq.i;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 >= 1 ? $$3.c($$2 + 1) : ctq.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cya<?> ap_() {
      return cya.e;
   }
}
