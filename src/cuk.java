public class cuk extends cth {
   public cuk(ctf $$0) {
      super($$0);
   }

   public boolean a(cmg $$0, cxb $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cqm $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(dae.cf.l()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dae.cg.l()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(auv.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cqp.pp) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cqm a(cmg $$0, iz $$1) {
      cqm $$2 = new cqm(cqp.vS, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cqm $$4 = $$0.a($$3);
         if (!$$4.b()) {
            did $$5 = did.a($$4.d());
            if ($$5 != null) {
               crw.a($$2, $$5.b());
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
   public ctt<?> ar_() {
      return ctt.n;
   }
}
