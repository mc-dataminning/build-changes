public class cpc extends cok {
   public cpc(coh $$0) {
      super($$0);
   }

   public boolean a(chh $$0, csf $$1) {
      clo $$2 = clo.b;
      clo $$3 = clo.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clo $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cje) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(clr.vk)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cjh.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public clo a(chh $$0, it $$1) {
      clo $$2 = clo.b;
      clo $$3 = clo.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clo $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cje) {
               $$2 = $$5;
            } else if ($$5.a(clr.vk)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         sd $$6 = cjh.a($$2);
         sd $$7 = $$6 == null ? new sd() : $$6.h();
         $$7.a("Base", ((cje)$$2.d()).b().a());
         cjh.a($$3, dfk.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cox<?> as_() {
      return cox.l;
   }
}
