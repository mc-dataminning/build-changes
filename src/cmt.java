public class cmt extends cmd {
   public cmt(cma $$0) {
      super($$0);
   }

   public boolean a(cfb $$0, cpx $$1) {
      cjh $$2 = cjh.b;
      cjh $$3 = cjh.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cgx) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjk.uy)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cha.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cjh a(cfb $$0, hu $$1) {
      cjh $$2 = cjh.b;
      cjh $$3 = cjh.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cgx) {
               $$2 = $$5;
            } else if ($$5.a(cjk.uy)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         qy $$6 = cha.a($$2);
         qy $$7 = $$6 == null ? new qy() : $$6.h();
         $$7.a("Base", ((cgx)$$2.d()).b().a());
         cha.a($$3, dcz.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmo<?> an_() {
      return cmo.l;
   }
}
