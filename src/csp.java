public class csp extends crx {
   public csp(crv $$0) {
      super($$0);
   }

   public boolean a(ckv $$0, cvr $$1) {
      cpd $$2 = cpd.h;
      cpd $$3 = cpd.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cmt) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpg.vo)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cmw.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cpd a(ckv $$0, iw $$1) {
      cpd $$2 = cpd.h;
      cpd $$3 = cpd.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cmt) {
               $$2 = $$5;
            } else if ($$5.a(cpg.vo)) {
               $$3 = $$5.q();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         sw $$6 = cmw.a($$2);
         sw $$7 = $$6 == null ? new sw() : $$6.h();
         $$7.a("Base", ((cmt)$$2.d()).b().a());
         cmw.a($$3, diz.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csj<?> at_() {
      return csj.l;
   }
}
