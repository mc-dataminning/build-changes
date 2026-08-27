public class cyq extends cxm {
   public cyq(cxk $$0) {
      super($$0);
   }

   public boolean a(cpj $$0, dax $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cto $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.e()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(ctr.vr)) {
                     return false;
                  }
               } else if (!$$4.a(ctr.ov)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cto a(cpj $$0, iz.a $$1) {
      cto $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(ctr.vr)) {
         return cto.i;
      } else {
         cto $$3 = new cto(ctr.vq, 8);
         $$3.b(kb.F, $$2.a(kb.F));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cxy<?> ao_() {
      return cxy.j;
   }
}
