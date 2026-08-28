public class cyi extends cyp {
   public cyi(cyn $$0) {
      super($$0);
   }

   public boolean a(cqm $$0, dca $$1) {
      ctk $$2 = null;
      cur $$3 = null;
      cur $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cur $$6 = $$0.a($$5);
         if (!$$6.e()) {
            cum $$7 = $$6.g();
            if (!($$7 instanceof csm)) {
               return false;
            }

            csm $$8 = (csm)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(km.X, dpa.a).b().size();
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public cur a(cqm $$0, jk.a $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cur $$3 = $$0.a($$2);
         if (!$$3.e()) {
            int $$4 = $$3.a(km.X, dpa.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cur.l;
   }

   public jr<cur> a(cqm $$0) {
      jr<cur> $$1 = jr.a($$0.b(), cur.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cur $$3 = $$0.a($$2);
         if (!$$3.e()) {
            if ($$3.g().v()) {
               $$1.set($$2, new cur($$3.g().u()));
            } else if (!$$3.a(km.X, dpa.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public czb<?> ao_() {
      return czb.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
