public class czh extends cyp {
   public czh(cyn $$0) {
      super($$0);
   }

   public boolean a(cqm $$0, dca $$1) {
      cur $$2 = cur.l;
      cur $$3 = cur.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csm) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuu.vs)) {
                  return false;
               }

               if (!$$2.e()) {
                  return false;
               }

               dpa $$6 = $$5.a(km.X, dpa.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.e() && !$$3.e();
   }

   public cur a(cqm $$0, jk.a $$1) {
      cur $$2 = cur.l;
      cur $$3 = cur.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csm) {
               $$2 = $$5;
            } else if ($$5.a(cuu.vs)) {
               $$3 = $$5.s();
            }
         }
      }

      if ($$3.e()) {
         return $$3;
      } else {
         $$3.b(km.X, $$2.a(km.X));
         $$3.b(km.Y, ((csm)$$2.g()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public czb<?> ao_() {
      return czb.l;
   }
}
