public class crz extends crt {
   public crz(crr $$0) {
      super($$0);
   }

   public boolean a(ckr $$0, cvn $$1) {
      int $$2 = 0;
      coz $$3 = coz.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cpc.rT)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpc.uf)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public coz a(ckr $$0, iw $$1) {
      int $$2 = 0;
      coz $$3 = coz.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cpc.rT)) {
               if (!$$3.b()) {
                  return coz.h;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpc.uf)) {
                  return coz.h;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : coz.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public csf<?> at_() {
      return csf.e;
   }
}
