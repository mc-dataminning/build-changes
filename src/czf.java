public class czf extends cyn {
   public czf(cyl $$0) {
      super($$0);
   }

   public boolean a(cqk $$0, dby $$1) {
      cup $$2 = cup.l;
      cup $$3 = cup.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csk) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cus.vs)) {
                  return false;
               }

               if (!$$2.e()) {
                  return false;
               }

               doy $$6 = $$5.a(km.X, doy.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.e() && !$$3.e();
   }

   public cup a(cqk $$0, jk.a $$1) {
      cup $$2 = cup.l;
      cup $$3 = cup.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csk) {
               $$2 = $$5;
            } else if ($$5.a(cus.vs)) {
               $$3 = $$5.s();
            }
         }
      }

      if ($$3.e()) {
         return $$3;
      } else {
         $$3.b(km.X, $$2.a(km.X));
         $$3.b(km.Y, ((csk)$$2.g()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyz<?> ao_() {
      return cyz.l;
   }
}
