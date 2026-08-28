public class cyv extends cyb {
   public cyv(cxy $$0) {
      super($$0);
   }

   public boolean a(cxz $$0, dcg $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (dfi.a($$5.g()) instanceof dmh) {
               $$2++;
            } else {
               if (!($$5.g() instanceof csx)) {
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

   public cud a(cxz $$0, jl.a $$1) {
      cud $$2 = cud.l;
      csx $$3 = (csx)cug.ri;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         if (!$$5.e()) {
            cty $$6 = $$5.g();
            if (dfi.a($$6) instanceof dmh) {
               $$2 = $$5;
            } else if ($$6 instanceof csx) {
               $$3 = (csx)$$6;
            }
         }
      }

      dfi $$7 = dmh.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyo<?> ap_() {
      return cyo.m;
   }
}
