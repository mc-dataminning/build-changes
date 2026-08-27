public class ctz extends cth {
   public ctz(ctf $$0) {
      super($$0);
   }

   public boolean a(cmg $$0, cxb $$1) {
      cqm $$2 = cqm.h;
      cqm $$3 = cqm.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof coe) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cqp.vq)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (coh.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cqm a(cmg $$0, iz $$1) {
      cqm $$2 = cqm.h;
      cqm $$3 = cqm.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof coe) {
               $$2 = $$5;
            } else if ($$5.a(cqp.vq)) {
               $$3 = $$5.q();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         ta $$6 = coh.a($$2);
         ta $$7 = $$6 == null ? new ta() : $$6.h();
         $$7.a("Base", ((coe)$$2.d()).b().a());
         coh.a($$3, dkk.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public ctt<?> ar_() {
      return ctt.l;
   }
}
