public class cwn extends cvk {
   public cwn(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         crs $$7 = $$0.a($$6);
         if (!$$7.d()) {
            if ($$7.a(dcj.cf.p()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dcj.cg.p()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(avm.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(crv.pp) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public crs a(cnm $$0, jb $$1) {
      crs $$2 = new crs(crv.vS, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         crs $$4 = $$0.a($$3);
         if (!$$4.d()) {
            dki $$5 = dki.a($$4.f());
            if ($$5 != null) {
               $$2.b(jr.y, $$5.b());
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
   public cvw<?> ao_() {
      return cvw.n;
   }
}
