public class cmt extends clt {
   public cmt(aer $$0, clr $$1) {
      super($$0, $$1);
   }

   public boolean a(ces $$0, cpm $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         ciy $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(csn.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(csn.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(apt.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cjb.oC) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public ciy a(ces $$0, hs $$1) {
      ciy $$2 = new ciy(cjb.va, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         ciy $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dap $$5 = dap.a($$4.d());
            if ($$5 != null) {
               cki.a($$2, $$5.a());
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
   public cmd<?> aj_() {
      return cmd.n;
   }
}
