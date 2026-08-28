public class cyu extends cyo {
   public cyu(cym $$0) {
      super($$0);
   }

   public boolean a(cql $$0, dbz $$1) {
      int $$2 = 0;
      cuq $$3 = cuq.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cut.rU)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cut.uj)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cuq a(cql $$0, jk.a $$1) {
      int $$2 = 0;
      cuq $$3 = cuq.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cut.rU)) {
               if (!$$3.e()) {
                  return cuq.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cut.uj)) {
                  return cuq.l;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 >= 1 ? $$3.c($$2 + 1) : cuq.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cza<?> ao_() {
      return cza.e;
   }
}
