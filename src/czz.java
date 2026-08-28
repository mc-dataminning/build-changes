public class czz extends czy {
   public czz(czv $$0) {
      super($$0);
   }

   public boolean a(czw $$0, deg $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cvp $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(axc.bu)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cvt.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cvp a(czw $$0, jp.a $$1) {
      dsy $$2 = new dsy($$0.a(1).h(), $$0.a(3).h(), $$0.a(5).h(), $$0.a(7).h());
      return dsi.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public dam<?> aq_() {
      return dam.v;
   }
}
