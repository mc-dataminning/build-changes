public class cnv extends cnf {
   public cnv(cnc $$0) {
      super($$0);
   }

   public boolean a(cgd $$0, cqz $$1) {
      ckj $$2 = ckj.b;
      ckj $$3 = ckj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chz) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ckm.uy)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cic.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public ckj a(cgd $$0, ip $$1) {
      ckj $$2 = ckj.b;
      ckj $$3 = ckj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chz) {
               $$2 = $$5;
            } else if ($$5.a(ckm.uy)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         rt $$6 = cic.a($$2);
         rt $$7 = $$6 == null ? new rt() : $$6.h();
         $$7.a("Base", ((chz)$$2.d()).b().a());
         cic.a($$3, ddz.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cnq<?> aq_() {
      return cnq.l;
   }
}
