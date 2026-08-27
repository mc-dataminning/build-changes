public class cyh extends cxo {
   public cyh(cxm $$0) {
      super($$0);
   }

   public boolean a(cpl $$0, daz $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (dea.a($$5.g()) instanceof dkz) {
               $$2++;
            } else {
               if (!($$5.g() instanceof csk)) {
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

   public ctq a(cpl $$0, iz.a $$1) {
      ctq $$2 = ctq.i;
      csk $$3 = (csk)ctt.ri;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            ctl $$6 = $$5.g();
            if (dea.a($$6) instanceof dkz) {
               $$2 = $$5;
            } else if ($$6 instanceof csk) {
               $$3 = (csk)$$6;
            }
         }
      }

      dea $$7 = dkz.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cya<?> ap_() {
      return cya.m;
   }
}
