public class cog extends cnf {
   public cog(cnc $$0) {
      super($$0);
   }

   public boolean a(cgd $$0, cqz $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         ckj $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cuc.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cuc.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(ara.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(ckm.oC) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public ckj a(cgd $$0, ip $$1) {
      ckj $$2 = new ckj(ckm.va, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         ckj $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dca $$5 = dca.a($$4.d());
            if ($$5 != null) {
               clt.a($$2, $$5.b());
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
   public cnq<?> aq_() {
      return cnq.n;
   }
}
