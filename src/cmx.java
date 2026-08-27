public class cmx extends cmh {
   public cmx(cme $$0) {
      super($$0);
   }

   public boolean a(cff $$0, cqb $$1) {
      cjl $$2 = cjl.b;
      cjl $$3 = cjl.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chb) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjo.uy)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (che.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cjl a(cff $$0, hr $$1) {
      cjl $$2 = cjl.b;
      cjl $$3 = cjl.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chb) {
               $$2 = $$5;
            } else if ($$5.a(cjo.uy)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         qw $$6 = che.a($$2);
         qw $$7 = $$6 == null ? new qw() : $$6.h();
         $$7.a("Base", ((chb)$$2.d()).b().a());
         che.a($$3, ddb.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cms<?> an_() {
      return cms.l;
   }
}
