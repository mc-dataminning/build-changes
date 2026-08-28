public class cyh extends cyb {
   public cyh(cxy $$0) {
      super($$0);
   }

   public boolean a(cxz $$0, dcg $$1) {
      int $$2 = 0;
      cud $$3 = cud.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cug.rU)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cug.uj)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cud a(cxz $$0, jl.a $$1) {
      int $$2 = 0;
      cud $$3 = cud.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cug.rU)) {
               if (!$$3.e()) {
                  return cud.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cug.uj)) {
                  return cud.l;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 >= 1 ? $$3.c($$2 + 1) : cud.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cyo<?> ap_() {
      return cyo.e;
   }
}
