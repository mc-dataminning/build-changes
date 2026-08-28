public class czp extends cyl {
   public czp(cyj $$0) {
      super($$0);
   }

   public boolean a(cqi $$0, dbw $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cun $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.e()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cuq.vr)) {
                     return false;
                  }
               } else if (!$$4.a(cuq.ov)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cun a(cqi $$0, jk.a $$1) {
      cun $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cuq.vr)) {
         return cun.l;
      } else {
         cun $$3 = new cun(cuq.vq, 8);
         $$3.b(km.F, $$2.a(km.F));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cyx<?> ap_() {
      return cyx.j;
   }
}
