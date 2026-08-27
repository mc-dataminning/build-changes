public class cpj extends cof {
   public cpj(coc $$0) {
      super($$0);
   }

   public boolean a(chc $$0, csa $$1) {
      if ($$0.ay_() == 3 && $$0.az_() == 3) {
         for (int $$2 = 0; $$2 < $$0.ay_(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.az_(); $$3++) {
               clj $$4 = $$0.a($$2 + $$3 * $$0.ay_());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(clm.vj)) {
                     return false;
                  }
               } else if (!$$4.a(clm.os)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public clj a(chc $$0, ip $$1) {
      clj $$2 = $$0.a(1 + $$0.ay_());
      if (!$$2.a(clm.vj)) {
         return clj.b;
      } else {
         clj $$3 = new clj(clm.vi, 8);
         cni.a($$3, cni.d($$2));
         cni.a($$3, cni.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cos<?> aq_() {
      return cos.j;
   }
}
