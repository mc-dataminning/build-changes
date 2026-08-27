public class cmt extends cls {
   public cmt(aer $$0, clq $$1) {
      super($$0, $$1);
   }

   public boolean a(cer $$0, cpl $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cix $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cja.ux)) {
                     return false;
                  }
               } else if (!$$4.a(cja.nH)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cix a(cer $$0, hs $$1) {
      cix $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cja.ux)) {
         return cix.b;
      } else {
         cix $$3 = new cix(cja.uw, 8);
         ckw.a($$3, ckw.d($$2));
         ckw.a($$3, ckw.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cmc<?> ai_() {
      return cmc.j;
   }
}
