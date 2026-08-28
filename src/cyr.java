public class cyr extends cxy {
   public cyr(cxv $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, dcd $$1) {
      cua $$2 = cua.l;
      cua $$3 = cua.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof crv) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cud.vs)) {
                  return false;
               }

               if (!$$2.e()) {
                  return false;
               }

               dpe $$6 = $$5.a(kn.X, dpe.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.e() && !$$3.e();
   }

   public cua a(cxw $$0, jl.a $$1) {
      cua $$2 = cua.l;
      cua $$3 = cua.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof crv) {
               $$2 = $$5;
            } else if ($$5.a(cud.vs)) {
               $$3 = $$5.s();
            }
         }
      }

      if ($$3.e()) {
         return $$3;
      } else {
         $$3.b(kn.X, $$2.a(kn.X));
         $$3.b(kn.Y, ((crv)$$2.g()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyl<?> ap_() {
      return cyl.l;
   }
}
