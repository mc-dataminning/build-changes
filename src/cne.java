public class cne extends cmd {
   public cne(cma $$0) {
      super($$0);
   }

   public boolean a(cfb $$0, cpx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cjh $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(csy.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(csy.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(aqc.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cjk.oC) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cjh a(cfb $$0, hu $$1) {
      cjh $$2 = new cjh(cjk.va, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cjh $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dba $$5 = dba.a($$4.d());
            if ($$5 != null) {
               ckr.a($$2, $$5.a());
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
   public cmo<?> an_() {
      return cmo.n;
   }
}
