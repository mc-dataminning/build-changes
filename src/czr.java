public class czr extends cyo {
   public czr(cym $$0) {
      super($$0);
   }

   public boolean a(cql $$0, dbz $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cuq $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dfc.cf.r()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dfc.cg.r()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awy.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cut.pq) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cuq a(cql $$0, jk.a $$1) {
      cuq $$2 = new cuq(cut.vU, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cuq $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dnc $$5 = dnc.a($$4.g());
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
   public cza<?> ao_() {
      return cza.n;
   }
}
