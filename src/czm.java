public class czm extends cyi {
   public czm(cyg $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, dbt $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cuk $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.e()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cun.vr)) {
                     return false;
                  }
               } else if (!$$4.a(cun.ov)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cuk a(cqf $$0, jk.a $$1) {
      cuk $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cun.vr)) {
         return cuk.l;
      } else {
         cuk $$3 = new cuk(cun.vq, 8);
         $$3.b(km.F, $$2.a(km.F));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cyu<?> ap_() {
      return cyu.j;
   }
}
