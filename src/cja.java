public class cja extends ciu {
   public cja(acq $$0, cis $$1) {
      super($$0, $$1);
   }

   public boolean a(cbt $$0, cmm $$1) {
      int $$2 = 0;
      cfz $$3 = cfz.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cfz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cgc.rf)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cgc.tp)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cfz a(cbt $$0, hs $$1) {
      int $$2 = 0;
      cfz $$3 = cfz.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cfz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cgc.rf)) {
               if (!$$3.b()) {
                  return cfz.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cgc.tp)) {
                  return cfz.b;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cfz.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cje<?> aj_() {
      return cje.e;
   }
}
