public class cpb extends cnx {
   public cpb(cnu $$0) {
      super($$0);
   }

   public boolean a(cgu $$0, crs $$1) {
      if ($$0.ax_() == 3 && $$0.ay_() == 3) {
         for (int $$2 = 0; $$2 < $$0.ax_(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.ay_(); $$3++) {
               clb $$4 = $$0.a($$2 + $$3 * $$0.ax_());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cle.uy)) {
                     return false;
                  }
               } else if (!$$4.a(cle.nH)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public clb a(cgu $$0, ip $$1) {
      clb $$2 = $$0.a(1 + $$0.ax_());
      if (!$$2.a(cle.uy)) {
         return clb.b;
      } else {
         clb $$3 = new clb(cle.ux, 8);
         cna.a($$3, cna.d($$2));
         cna.a($$3, cna.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public coj<?> aq_() {
      return coj.j;
   }
}
