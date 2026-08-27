public class cwr extends cvy {
   public cwr(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if (dcv.a($$5.f()) instanceof dju) {
               $$2++;
            } else {
               if (!($$5.f() instanceof cqx)) {
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

   public csd a(cnx $$0, jj $$1) {
      csd $$2 = csd.i;
      cqx $$3 = (cqx)csg.ri;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            cry $$6 = $$5.f();
            if (dcv.a($$6) instanceof dju) {
               $$2 = $$5;
            } else if ($$6 instanceof cqx) {
               $$3 = (cqx)$$6;
            }
         }
      }

      dcv $$7 = dju.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cwk<?> ao_() {
      return cwk.m;
   }
}
