public class cny extends cnx {
   public cny(cnu $$0) {
      super($$0);
   }

   public boolean a(cgu $$0, crs $$1) {
      if (!this.a($$0.ax_(), $$0.ay_())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            clb $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(ark.aM)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cle.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public clb a(cgu $$0, ip $$1) {
      dfh.a $$2 = new dfh.a($$0.a(1).d(), $$0.a(3).d(), $$0.a(5).d(), $$0.a(7).d());
      return dfh.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public coj<?> aq_() {
      return coj.w;
   }
}
