public class cyh extends cyo {
   public cyh(cym $$0) {
      super($$0);
   }

   public boolean a(cql $$0, dbz $$1) {
      ctj $$2 = null;
      cuq $$3 = null;
      cuq $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cuq $$6 = $$0.a($$5);
         if (!$$6.e()) {
            cul $$7 = $$6.g();
            if (!($$7 instanceof csl)) {
               return false;
            }

            csl $$8 = (csl)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(km.X, doz.a).b().size();
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

   public cuq a(cql $$0, jk.a $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cuq $$3 = $$0.a($$2);
         if (!$$3.e()) {
            int $$4 = $$3.a(km.X, doz.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cuq.l;
   }

   public jr<cuq> a(cql $$0) {
      jr<cuq> $$1 = jr.a($$0.b(), cuq.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuq $$3 = $$0.a($$2);
         if (!$$3.e()) {
            if ($$3.g().v()) {
               $$1.set($$2, new cuq($$3.g().u()));
            } else if (!$$3.a(km.X, doz.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cza<?> ao_() {
      return cza.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
