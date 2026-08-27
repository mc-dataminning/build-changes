public class clt extends cls {
   public clt(aer $$0, clq $$1) {
      super($$0, $$1);
   }

   public boolean a(cer $$0, cpl $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            cix $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(apt.aM)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cja.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cix a(cer $$0, hs $$1) {
      dda.a $$2 = new dda.a($$0.a(1).d(), $$0.a(3).d(), $$0.a(5).d(), $$0.a(7).d());
      return dda.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cmc<?> ai_() {
      return cmc.w;
   }
}
