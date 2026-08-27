public class cog extends cof {
   public cog(coc $$0) {
      super($$0);
   }

   public boolean a(chc $$0, csa $$1) {
      if (!this.a($$0.ay_(), $$0.az_())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            clj $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(aro.aM)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(clm.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public clj a(chc $$0, ip $$1) {
      dft.a $$2 = new dft.a($$0.a(1).d(), $$0.a(3).d(), $$0.a(5).d(), $$0.a(7).d());
      return dft.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cos<?> aq_() {
      return cos.w;
   }
}
