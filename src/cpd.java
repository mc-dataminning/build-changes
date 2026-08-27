public class cpd extends cok {
   public cpd(coh $$0) {
      super($$0);
   }

   public boolean a(chh $$0, csf $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clo $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cvf.a($$5.d()) instanceof dcd) {
               $$2++;
            } else {
               if (!($$5.d() instanceof ckd)) {
                  return false;
               }

               $$3++;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public clo a(chh $$0, it $$1) {
      clo $$2 = clo.b;
      ckd $$3 = (ckd)clr.rf;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clo $$5 = $$0.a($$4);
         if (!$$5.b()) {
            clj $$6 = $$5.d();
            if (cvf.a($$6) instanceof dcd) {
               $$2 = $$5;
            } else if ($$6 instanceof ckd) {
               $$3 = (ckd)$$6;
            }
         }
      }

      clo $$7 = dcd.b($$3.d());
      if ($$2.u()) {
         $$7.c($$2.v().h());
      }

      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cox<?> as_() {
      return cox.m;
   }
}
