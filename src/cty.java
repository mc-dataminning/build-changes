public class cty extends ctf {
   public cty(ctd $$0) {
      super($$0);
   }

   public boolean a(cme $$0, cwz $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqk $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (daa.a($$5.d()) instanceof dgy) {
               $$2++;
            } else {
               if (!($$5.d() instanceof cpc)) {
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

   public cqk a(cme $$0, iz $$1) {
      cqk $$2 = cqk.h;
      cpc $$3 = (cpc)cqn.rh;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqk $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cqf $$6 = $$5.d();
            if (daa.a($$6) instanceof dgy) {
               $$2 = $$5;
            } else if ($$6 instanceof cpc) {
               $$3 = (cpc)$$6;
            }
         }
      }

      daa $$7 = dgy.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public ctr<?> ar_() {
      return ctr.m;
   }
}
