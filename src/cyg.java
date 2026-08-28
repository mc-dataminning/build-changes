public class cyg extends cya {
   public cyg(cxx $$0) {
      super($$0);
   }

   public boolean a(cxy $$0, dcf $$1) {
      int $$2 = 0;
      cuc $$3 = cuc.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cuf.rU)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuf.uj)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cuc a(cxy $$0, jl.a $$1) {
      int $$2 = 0;
      cuc $$3 = cuc.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cuf.rU)) {
               if (!$$3.e()) {
                  return cuc.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuf.uj)) {
                  return cuc.l;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 >= 1 ? $$3.c($$2 + 1) : cuc.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cyn<?> ap_() {
      return cyn.e;
   }
}
