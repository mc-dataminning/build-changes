public class cmi extends clt {
   public cmi(aer $$0, clr $$1) {
      super($$0, $$1);
   }

   public boolean a(ces $$0, cpm $$1) {
      ciy $$2 = ciy.b;
      ciy $$3 = ciy.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cgo) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjb.uy)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cgr.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public ciy a(ces $$0, hs $$1) {
      ciy $$2 = ciy.b;
      ciy $$3 = ciy.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cgo) {
               $$2 = $$5;
            } else if ($$5.a(cjb.uy)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         qr $$6 = cgr.a($$2);
         qr $$7 = $$6 == null ? new qr() : $$6.h();
         $$7.a("Base", ((cgo)$$2.d()).b().a());
         cgr.a($$3, dco.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmd<?> aj_() {
      return cmd.l;
   }
}
