public class cui extends ctf {
   public cui(ctd $$0) {
      super($$0);
   }

   public boolean a(cme $$0, cwz $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cqk $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(dac.cf.l()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dac.cg.l()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(auv.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cqn.pp) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cqk a(cme $$0, iz $$1) {
      cqk $$2 = new cqk(cqn.vR, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cqk $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dib $$5 = dib.a($$4.d());
            if ($$5 != null) {
               cru.a($$2, $$5.b());
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
   public ctr<?> ar_() {
      return ctr.n;
   }
}
