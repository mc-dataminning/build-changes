public class cvl extends cvk {
   public cvl(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            crs $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(avm.aR)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(crv.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public crs a(cnm $$0, jb $$1) {
      dns $$2 = new dns($$0.a(1).f(), $$0.a(3).f(), $$0.a(5).f(), $$0.a(7).f());
      return dne.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cvw<?> ao_() {
      return cvw.w;
   }
}
