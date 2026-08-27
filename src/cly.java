public class cly extends cls {
   public cly(aer $$0, clq $$1) {
      super($$0, $$1);
   }

   public boolean a(cer $$0, cpl $$1) {
      int $$2 = 0;
      cix $$3 = cix.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cix $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cja.rf)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cja.tp)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cix a(cer $$0, hs $$1) {
      int $$2 = 0;
      cix $$3 = cix.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cix $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cja.rf)) {
               if (!$$3.b()) {
                  return cix.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cja.tp)) {
                  return cix.b;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cix.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cmc<?> ai_() {
      return cmc.e;
   }
}
