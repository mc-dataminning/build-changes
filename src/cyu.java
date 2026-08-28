public class cyu extends cyb {
   public cyu(cxy $$0) {
      super($$0);
   }

   public boolean a(cxz $$0, dcg $$1) {
      cud $$2 = cud.l;
      cud $$3 = cud.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof crz) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cug.vs)) {
                  return false;
               }

               if (!$$2.e()) {
                  return false;
               }

               dph $$6 = $$5.a(kn.X, dph.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.e() && !$$3.e();
   }

   public cud a(cxz $$0, jl.a $$1) {
      cud $$2 = cud.l;
      cud $$3 = cud.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof crz) {
               $$2 = $$5;
            } else if ($$5.a(cug.vs)) {
               $$3 = $$5.s();
            }
         }
      }

      if ($$3.e()) {
         return $$3;
      } else {
         $$3.b(kn.X, $$2.a(kn.X));
         $$3.b(kn.Y, ((crz)$$2.g()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyo<?> ap_() {
      return cyo.l;
   }
}
