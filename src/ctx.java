public class ctx extends ctf {
   public ctx(ctd $$0) {
      super($$0);
   }

   public boolean a(cme $$0, cwz $$1) {
      cqk $$2 = cqk.h;
      cqk $$3 = cqk.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqk $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof coc) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cqn.vp)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cof.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cqk a(cme $$0, iz $$1) {
      cqk $$2 = cqk.h;
      cqk $$3 = cqk.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqk $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof coc) {
               $$2 = $$5;
            } else if ($$5.a(cqn.vp)) {
               $$3 = $$5.q();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         ta $$6 = cof.a($$2);
         ta $$7 = $$6 == null ? new ta() : $$6.h();
         $$7.a("Base", ((coc)$$2.d()).b().a());
         cof.a($$3, dki.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public ctr<?> ar_() {
      return ctr.l;
   }
}
