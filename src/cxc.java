public class cxc extends cvy {
   public cxc(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               csd $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.d()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(csg.vr)) {
                     return false;
                  }
               } else if (!$$4.a(csg.ov)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public csd a(cnx $$0, jj $$1) {
      csd $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(csg.vr)) {
         return csd.i;
      } else {
         csd $$3 = new csd(csg.vq, 8);
         $$3.b(jz.x, $$2.a(jz.x));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cwk<?> ao_() {
      return cwk.j;
   }
}
