public class czr extends cyn {
   public czr(cyl $$0) {
      super($$0);
   }

   public boolean a(cqk $$0, dby $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cup $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.e()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cus.vr)) {
                     return false;
                  }
               } else if (!$$4.a(cus.ov)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cup a(cqk $$0, jk.a $$1) {
      cup $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cus.vr)) {
         return cup.l;
      } else {
         cup $$3 = new cup(cus.vq, 8);
         $$3.b(km.G, $$2.a(km.G));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cyz<?> ao_() {
      return cyz.j;
   }
}
