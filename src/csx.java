public class csx extends crt {
   public csx(crr $$0) {
      super($$0);
   }

   public boolean a(ckr $$0, cvn $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               coz $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cpc.vn)) {
                     return false;
                  }
               } else if (!$$4.a(cpc.ou)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public coz a(ckr $$0, iw $$1) {
      coz $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cpc.vn)) {
         return coz.h;
      } else {
         coz $$3 = new coz(cpc.vm, 8);
         cqx.a($$3, cqx.d($$2));
         cqx.a($$3, cqx.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public csf<?> at_() {
      return csf.j;
   }
}
