public class cpv extends cpd {
   public cpv(cpb $$0) {
      super($$0);
   }

   public boolean a(cia $$0, csy $$1) {
      cmh $$2 = cmh.f;
      cmh $$3 = cmh.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cjx) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cmk.vl)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cka.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cmh a(cia $$0, is $$1) {
      cmh $$2 = cmh.f;
      cmh $$3 = cmh.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cjx) {
               $$2 = $$5;
            } else if ($$5.a(cmk.vl)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         sj $$6 = cka.a($$2);
         sj $$7 = $$6 == null ? new sj() : $$6.h();
         $$7.a("Base", ((cjx)$$2.d()).b().a());
         cka.a($$3, dgf.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cpp<?> ar_() {
      return cpp.l;
   }
}
