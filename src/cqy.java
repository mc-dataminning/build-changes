public class cqy extends cpu {
   public cqy(cps $$0) {
      super($$0);
   }

   public boolean a(cir $$0, ctp $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cmy $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cnb.vk)) {
                     return false;
                  }
               } else if (!$$4.a(cnb.os)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cmy a(cir $$0, iu $$1) {
      cmy $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cnb.vk)) {
         return cmy.f;
      } else {
         cmy $$3 = new cmy(cnb.vj, 8);
         coy.a($$3, coy.d($$2));
         coy.a($$3, coy.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cqg<?> ar_() {
      return cqg.j;
   }
}
