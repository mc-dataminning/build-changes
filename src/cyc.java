public class cyc extends cyb {
   public cyc(cxy $$0) {
      super($$0);
   }

   public boolean a(cxz $$0, dcg $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cud $$3 = $$0.a($$2);
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
                  if (!$$3.a(cug.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cud a(cxz $$0, jl.a $$1) {
      dqv $$2 = new dqv($$0.a(1).g(), $$0.a(3).g(), $$0.a(5).g(), $$0.a(7).g());
      return dqg.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cyo<?> ap_() {
      return cyo.w;
   }
}
