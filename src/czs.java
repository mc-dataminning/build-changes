public class czs extends cyp {
   public czs(cyn $$0) {
      super($$0);
   }

   public boolean a(cqm $$0, dca $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cur $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dfd.cf.r()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dfd.cg.r()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awy.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cuu.pq) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cur a(cqm $$0, jk.a $$1) {
      cur $$2 = new cur(cuu.vU, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cur $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dnd $$5 = dnd.a($$4.g());
            if ($$5 != null) {
               $$2.b(km.H, $$5.b());
               break;
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public czb<?> ao_() {
      return czb.n;
   }
}
