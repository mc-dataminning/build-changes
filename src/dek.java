public class dek extends dcz {
   public dek(dcw $$0) {
      super($$0);
   }

   public boolean a(dcx $$0, dip $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cys $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cyw.wv)) {
                     return false;
                  }
               } else if (!$$4.a(cyw.pf)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cys a(dcx $$0, jg.a $$1) {
      cys $$2 = $$0.a(1, 1);
      if (!$$2.a(cyw.wv)) {
         return cys.k;
      } else {
         cys $$3 = new cys(cyw.wu, 8);
         $$3.b(kj.R, $$2.a(kj.R));
         return $$3;
      }
   }

   @Override
   public ddt<dek> a() {
      return ddt.j;
   }
}
