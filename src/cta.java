public class cta extends crx {
   public cta(crv $$0) {
      super($$0);
   }

   public boolean a(ckv $$0, cvr $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cpd $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cyu.cf.j()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cyu.cg.j()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(aui.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cpg.pp) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cpd a(ckv $$0, iw $$1) {
      cpd $$2 = new cpd(cpg.vQ, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cpd $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dgt $$5 = dgt.a($$4.d());
            if ($$5 != null) {
               cqn.a($$2, $$5.b());
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
   public csj<?> at_() {
      return csj.n;
   }
}
