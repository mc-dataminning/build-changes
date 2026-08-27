public class cop extends cnx {
   public cop(cnu $$0) {
      super($$0);
   }

   public boolean a(cgu $$0, crs $$1) {
      clb $$2 = clb.b;
      clb $$3 = clb.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cir) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cle.uz)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (ciu.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public clb a(cgu $$0, ip $$1) {
      clb $$2 = clb.b;
      clb $$3 = clb.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cir) {
               $$2 = $$5;
            } else if ($$5.a(cle.uz)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         rz $$6 = ciu.a($$2);
         rz $$7 = $$6 == null ? new rz() : $$6.h();
         $$7.a("Base", ((cir)$$2.d()).b().a());
         ciu.a($$3, det.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public coj<?> aq_() {
      return coj.l;
   }
}
