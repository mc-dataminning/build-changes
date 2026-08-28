public class dac extends dab {
   public dac(czy $$0) {
      super($$0);
   }

   public boolean a(czz $$0, dej $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cvs $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(axe.bu)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cvw.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cvs a(czz $$0, jq.a $$1) {
      dtb $$2 = new dtb($$0.a(1).h(), $$0.a(3).h(), $$0.a(5).h(), $$0.a(7).h());
      return dsl.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public dap<?> ar_() {
      return dap.v;
   }
}
