public class cye extends cxy {
   public cye(cxv $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, dcd $$1) {
      int $$2 = 0;
      cua $$3 = cua.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cud.rU)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cud.uj)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cua a(cxw $$0, jl.a $$1) {
      int $$2 = 0;
      cua $$3 = cua.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cud.rU)) {
               if (!$$3.e()) {
                  return cua.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cud.uj)) {
                  return cua.l;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 >= 1 ? $$3.c($$2 + 1) : cua.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cyl<?> ap_() {
      return cyl.e;
   }
}
