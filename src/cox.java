public class cox extends cof {
   public cox(coc $$0) {
      super($$0);
   }

   public boolean a(chc $$0, csa $$1) {
      clj $$2 = clj.b;
      clj $$3 = clj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ciz) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(clm.vk)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cjc.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public clj a(chc $$0, ip $$1) {
      clj $$2 = clj.b;
      clj $$3 = clj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ciz) {
               $$2 = $$5;
            } else if ($$5.a(clm.vk)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         rz $$6 = cjc.a($$2);
         rz $$7 = $$6 == null ? new rz() : $$6.h();
         $$7.a("Base", ((ciz)$$2.d()).b().a());
         cjc.a($$3, dff.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cos<?> aq_() {
      return cos.l;
   }
}
