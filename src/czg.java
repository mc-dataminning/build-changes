public class czg extends cyo {
   public czg(cym $$0) {
      super($$0);
   }

   public boolean a(cql $$0, dbz $$1) {
      cuq $$2 = cuq.l;
      cuq $$3 = cuq.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csl) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cut.vs)) {
                  return false;
               }

               if (!$$2.e()) {
                  return false;
               }

               doz $$6 = $$5.a(km.X, doz.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.e() && !$$3.e();
   }

   public cuq a(cql $$0, jk.a $$1) {
      cuq $$2 = cuq.l;
      cuq $$3 = cuq.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csl) {
               $$2 = $$5;
            } else if ($$5.a(cut.vs)) {
               $$3 = $$5.s();
            }
         }
      }

      if ($$3.e()) {
         return $$3;
      } else {
         $$3.b(km.X, $$2.a(km.X));
         $$3.b(km.Y, ((csl)$$2.g()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cza<?> ao_() {
      return cza.l;
   }
}
