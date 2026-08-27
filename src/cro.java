public class cro extends crt {
   public cro(crr $$0) {
      super($$0);
   }

   public boolean a(ckr $$0, cvn $$1) {
      int $$2 = 0;
      coz $$3 = coz.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cpc.tX)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpc.tW)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.v() && $$2 > 0;
   }

   public coz a(ckr $$0, iw $$1) {
      int $$2 = 0;
      coz $$3 = coz.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cpc.tX)) {
               if (!$$3.b()) {
                  return coz.h;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpc.tW)) {
                  return coz.h;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.v() && $$2 >= 1 && cqu.d($$3) < 2) {
         coz $$6 = new coz(cpc.tX, $$2);
         sw $$7 = $$3.w().h();
         $$7.a("generation", cqu.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return coz.h;
      }
   }

   public is<coz> a(ckr $$0) {
      is<coz> $$1 = is.a($$0.b(), coz.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         coz $$3 = $$0.a($$2);
         if ($$3.d().s()) {
            $$1.set($$2, new coz($$3.d().r()));
         } else if ($$3.d() instanceof cqu) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public csf<?> at_() {
      return csf.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
