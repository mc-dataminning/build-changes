public class cqr extends cpn {
   public cqr(cpl $$0) {
      super($$0);
   }

   public boolean a(cik $$0, cti $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cmr $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cmu.vk)) {
                     return false;
                  }
               } else if (!$$4.a(cmu.os)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cmr a(cik $$0, iu $$1) {
      cmr $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cmu.vk)) {
         return cmr.f;
      } else {
         cmr $$3 = new cmr(cmu.vj, 8);
         cor.a($$3, cor.d($$2));
         cor.a($$3, cor.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cpz<?> ar_() {
      return cpz.j;
   }
}
