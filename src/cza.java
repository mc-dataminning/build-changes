public class cza extends cyi {
   public cza(cyg $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, dbt $$1) {
      cuk $$2 = cuk.l;
      cuk $$3 = cuk.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csf) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cun.vs)) {
                  return false;
               }

               if (!$$2.e()) {
                  return false;
               }

               dot $$6 = $$5.a(km.W, dot.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.e() && !$$3.e();
   }

   public cuk a(cqf $$0, jk.a $$1) {
      cuk $$2 = cuk.l;
      cuk $$3 = cuk.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csf) {
               $$2 = $$5;
            } else if ($$5.a(cun.vs)) {
               $$3 = $$5.s();
            }
         }
      }

      if ($$3.e()) {
         return $$3;
      } else {
         $$3.b(km.W, $$2.a(km.W));
         $$3.b(km.X, ((csf)$$2.g()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyu<?> ap_() {
      return cyu.l;
   }
}
