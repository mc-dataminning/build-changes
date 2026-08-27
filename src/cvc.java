public class cvc extends cvb {
   public cvc(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            crj $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(avk.aR)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(crm.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public crj a(cnf $$0, iz $$1) {
      dnj $$2 = new dnj($$0.a(1).f(), $$0.a(3).f(), $$0.a(5).f(), $$0.a(7).f());
      return dmv.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cvn<?> ap_() {
      return cvn.w;
   }
}
