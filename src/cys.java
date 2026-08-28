public class cys extends cxy {
   public cys(cxv $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, dcd $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (dff.a($$5.g()) instanceof dme) {
               $$2++;
            } else {
               if (!($$5.g() instanceof csu)) {
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

   public cua a(cxw $$0, jl.a $$1) {
      cua $$2 = cua.l;
      csu $$3 = (csu)cud.ri;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         if (!$$5.e()) {
            ctv $$6 = $$5.g();
            if (dff.a($$6) instanceof dme) {
               $$2 = $$5;
            } else if ($$6 instanceof csu) {
               $$3 = (csu)$$6;
            }
         }
      }

      dff $$7 = dme.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyl<?> ap_() {
      return cyl.m;
   }
}
