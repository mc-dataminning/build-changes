public class dab extends daa {
   public dab(czx $$0) {
      super($$0);
   }

   public boolean a(czy $$0, dev $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cvx $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(axi.bD)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cwb.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cvx a(czy $$0, jr.a $$1) {
      dtm $$2 = new dtm($$0.a(1).h(), $$0.a(3).h(), $$0.a(5).h(), $$0.a(7).h());
      return dsw.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public dao<?> ar_() {
      return dao.v;
   }
}
