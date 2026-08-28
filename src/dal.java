public class dal extends dak {
   public dal(dah $$0) {
      super($$0);
   }

   public boolean a(dai $$0, dff $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cwf $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(axm.bH)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cwj.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cwf a(dai $$0, js.a $$1) {
      dtx $$2 = new dtx($$0.a(1).h(), $$0.a(3).h(), $$0.a(5).h(), $$0.a(7).h());
      return dth.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public day<?> aq_() {
      return day.v;
   }
}
