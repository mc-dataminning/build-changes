public class cni extends cmh {
   public cni(cme $$0) {
      super($$0);
   }

   public boolean a(cff $$0, cqb $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cjl $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cte.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cte.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(aqd.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cjo.oC) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cjl a(cff $$0, hr $$1) {
      cjl $$2 = new cjl(cjo.va, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cjl $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dbc $$5 = dbc.a($$4.d());
            if ($$5 != null) {
               ckv.a($$2, $$5.b());
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
   public cms<?> an_() {
      return cms.n;
   }
}
