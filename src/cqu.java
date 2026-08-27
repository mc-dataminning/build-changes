public class cqu extends cqc {
   public cqu(cqa $$0) {
      super($$0);
   }

   public boolean a(ciz $$0, ctx $$1) {
      cng $$2 = cng.f;
      cng $$3 = cng.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ckx) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cnj.vo)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cla.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cng a(ciz $$0, iu $$1) {
      cng $$2 = cng.f;
      cng $$3 = cng.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ckx) {
               $$2 = $$5;
            } else if ($$5.a(cnj.vo)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         so $$6 = cla.a($$2);
         so $$7 = $$6 == null ? new so() : $$6.h();
         $$7.a("Base", ((ckx)$$2.d()).b().a());
         cla.a($$3, dhf.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cqo<?> at_() {
      return cqo.l;
   }
}
