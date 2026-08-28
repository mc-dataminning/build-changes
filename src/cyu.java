public class cyu extends cya {
   public cyu(cxx $$0) {
      super($$0);
   }

   public boolean a(cxy $$0, dcf $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (dfh.a($$5.g()) instanceof dmg) {
               $$2++;
            } else {
               if (!($$5.g() instanceof csw)) {
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

   public cuc a(cxy $$0, jl.a $$1) {
      cuc $$2 = cuc.l;
      csw $$3 = (csw)cuf.ri;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         if (!$$5.e()) {
            ctx $$6 = $$5.g();
            if (dfh.a($$6) instanceof dmg) {
               $$2 = $$5;
            } else if ($$6 instanceof csw) {
               $$3 = (csw)$$6;
            }
         }
      }

      dfh $$7 = dmg.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyn<?> ap_() {
      return cyn.m;
   }
}
