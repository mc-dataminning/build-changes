public class cys extends cxo {
   public cys(cxm $$0) {
      super($$0);
   }

   public boolean a(cpl $$0, daz $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               ctq $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.e()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(ctt.vr)) {
                     return false;
                  }
               } else if (!$$4.a(ctt.ov)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public ctq a(cpl $$0, iz.a $$1) {
      ctq $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(ctt.vr)) {
         return ctq.i;
      } else {
         ctq $$3 = new ctq(ctt.vq, 8);
         $$3.b(kb.F, $$2.a(kb.F));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cya<?> ap_() {
      return cya.j;
   }
}
