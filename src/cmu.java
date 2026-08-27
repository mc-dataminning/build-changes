public class cmu extends clt {
   public cmu(aer $$0, clr $$1) {
      super($$0, $$1);
   }

   public boolean a(ces $$0, cpm $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               ciy $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cjb.ux)) {
                     return false;
                  }
               } else if (!$$4.a(cjb.nH)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public ciy a(ces $$0, hs $$1) {
      ciy $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cjb.ux)) {
         return ciy.b;
      } else {
         ciy $$3 = new ciy(cjb.uw, 8);
         ckx.a($$3, ckx.d($$2));
         ckx.a($$3, ckx.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cmd<?> aj_() {
      return cmd.j;
   }
}
