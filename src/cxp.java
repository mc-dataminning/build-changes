public class cxp extends cxo {
   public cxp(cxm $$0) {
      super($$0);
   }

   public boolean a(cpl $$0, daz $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            ctq $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(awf.bq)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(ctt.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public ctq a(cpl $$0, iz.a $$1) {
      dpm $$2 = new dpm($$0.a(1).g(), $$0.a(3).g(), $$0.a(5).g(), $$0.a(7).g());
      return doy.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cya<?> ap_() {
      return cya.w;
   }
}
