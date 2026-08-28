public class cyv extends cyp {
   public cyv(cyn $$0) {
      super($$0);
   }

   public boolean a(cqm $$0, dca $$1) {
      int $$2 = 0;
      cur $$3 = cur.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cuu.rU)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuu.uj)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cur a(cqm $$0, jk.a $$1) {
      int $$2 = 0;
      cur $$3 = cur.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cuu.rU)) {
               if (!$$3.e()) {
                  return cur.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuu.uj)) {
                  return cur.l;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 >= 1 ? $$3.c($$2 + 1) : cur.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public czb<?> ao_() {
      return czb.e;
   }
}
