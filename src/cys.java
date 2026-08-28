public class cys extends cym {
   public cys(cyk $$0) {
      super($$0);
   }

   public boolean a(cqj $$0, dbx $$1) {
      int $$2 = 0;
      cuo $$3 = cuo.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cur.rU)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cur.uj)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cuo a(cqj $$0, jk.a $$1) {
      int $$2 = 0;
      cuo $$3 = cuo.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cur.rU)) {
               if (!$$3.e()) {
                  return cuo.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cur.uj)) {
                  return cuo.l;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 >= 1 ? $$3.c($$2 + 1) : cuo.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cyy<?> ao_() {
      return cyy.e;
   }
}
