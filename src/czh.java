public class czh extends cyo {
   public czh(cym $$0) {
      super($$0);
   }

   public boolean a(cql $$0, dbz $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (dfa.a($$5.g()) instanceof dlz) {
               $$2++;
            } else {
               if (!($$5.g() instanceof ctk)) {
                  return false;
               }

               $$3++;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public cuq a(cql $$0, jk.a $$1) {
      cuq $$2 = cuq.l;
      ctk $$3 = (ctk)cut.ri;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            cul $$6 = $$5.g();
            if (dfa.a($$6) instanceof dlz) {
               $$2 = $$5;
            } else if ($$6 instanceof ctk) {
               $$3 = (ctk)$$6;
            }
         }
      }

      dfa $$7 = dlz.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cza<?> ao_() {
      return cza.m;
   }
}
