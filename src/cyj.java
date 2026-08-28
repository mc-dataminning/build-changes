public class cyj extends cyi {
   public cyj(cyg $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, dbt $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            cuk $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(awu.bq)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cun.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cuk a(cqf $$0, jk.a $$1) {
      dqg $$2 = new dqg($$0.a(1).g(), $$0.a(3).g(), $$0.a(5).g(), $$0.a(7).g());
      return dps.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cyu<?> ap_() {
      return cyu.w;
   }
}
