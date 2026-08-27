public class cmm extends clw {
   public cmm(clt $$0) {
      super($$0);
   }

   public boolean a(ceu $$0, cpq $$1) {
      cja $$2 = cja.b;
      cja $$3 = cja.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cja $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cgq) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjd.uy)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cgt.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cja a(ceu $$0, hu $$1) {
      cja $$2 = cja.b;
      cja $$3 = cja.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cja $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cgq) {
               $$2 = $$5;
            } else if ($$5.a(cjd.uy)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         qu $$6 = cgt.a($$2);
         qu $$7 = $$6 == null ? new qu() : $$6.h();
         $$7.a("Base", ((cgq)$$2.d()).b().a());
         cgt.a($$3, dcs.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmh<?> ai_() {
      return cmh.l;
   }
}
