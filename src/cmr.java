public class cmr extends cmb {
   public cmr(cly $$0) {
      super($$0);
   }

   public boolean a(cez $$0, cpv $$1) {
      cjf $$2 = cjf.b;
      cjf $$3 = cjf.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cgv) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cji.uy)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cgy.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cjf a(cez $$0, hu $$1) {
      cjf $$2 = cjf.b;
      cjf $$3 = cjf.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cgv) {
               $$2 = $$5;
            } else if ($$5.a(cji.uy)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         qy $$6 = cgy.a($$2);
         qy $$7 = $$6 == null ? new qy() : $$6.h();
         $$7.a("Base", ((cgv)$$2.d()).b().a());
         cgy.a($$3, dcx.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmm<?> an_() {
      return cmm.l;
   }
}
