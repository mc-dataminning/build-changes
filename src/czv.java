public class czv extends cyp {
   public czv(cym $$0) {
      super($$0);
   }

   public boolean a(cyn $$0, dcu $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cuo $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dfy.cf.r()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dfy.cg.r()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awm.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cur.ot) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cuo a(cyn $$0, jo.a $$1) {
      cuo $$2 = new cuo(cur.vX, 1);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cuo $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dnz $$5 = dnz.a($$4.g());
            if ($$5 != null) {
               $$2.b(kq.H, $$5.b());
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
   public czc<?> ap_() {
      return czc.n;
   }
}
