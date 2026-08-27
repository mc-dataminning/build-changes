public class csw extends crt {
   public csw(crr $$0) {
      super($$0);
   }

   public boolean a(ckr $$0, cvn $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         coz $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cyq.cf.j()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cyq.cg.j()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(auh.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cpc.pp) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public coz a(ckr $$0, iw $$1) {
      coz $$2 = new coz(cpc.vQ, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         coz $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dgp $$5 = dgp.a($$4.d());
            if ($$5 != null) {
               cqj.a($$2, $$5.b());
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
   public csf<?> at_() {
      return csf.n;
   }
}
