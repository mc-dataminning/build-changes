public class cpn extends cok {
   public cpn(coh $$0) {
      super($$0);
   }

   public boolean a(chh $$0, csf $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         clo $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cvh.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cvh.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(ars.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(clr.pn) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public clo a(chh $$0, it $$1) {
      clo $$2 = new clo(clr.vM, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         clo $$4 = $$0.a($$3);
         if (!$$4.b()) {
            ddg $$5 = ddg.a($$4.d());
            if ($$5 != null) {
               cmy.a($$2, $$5.b());
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
   public cox<?> as_() {
      return cox.n;
   }
}
