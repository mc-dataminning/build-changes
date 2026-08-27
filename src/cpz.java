public class cpz extends cpt {
   public cpz(cpr $$0) {
      super($$0);
   }

   public boolean a(ciq $$0, cto $$1) {
      int $$2 = 0;
      cmx $$3 = cmx.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cna.rR)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cna.uc)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cmx a(ciq $$0, iu $$1) {
      int $$2 = 0;
      cmx $$3 = cmx.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cna.rR)) {
               if (!$$3.b()) {
                  return cmx.f;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cna.uc)) {
                  return cmx.f;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cmx.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cqf<?> ar_() {
      return cqf.e;
   }
}
