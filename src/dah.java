public class dah extends dag {
   public dah(dad $$0) {
      super($$0);
   }

   public boolean a(dae $$0, dfb $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cwb $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(axj.bG)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cwf.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cwb a(dae $$0, js.a $$1) {
      dts $$2 = new dts($$0.a(1).h(), $$0.a(3).h(), $$0.a(5).h(), $$0.a(7).h());
      return dtc.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public dau<?> aq_() {
      return dau.v;
   }
}
