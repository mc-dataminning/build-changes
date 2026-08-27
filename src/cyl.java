public class cyl extends cyq {
   public cyl(cyo $$0) {
      super($$0);
   }

   public boolean a(cpw $$0, dca $$1) {
      int $$2 = 0;
      cuh $$3 = cuh.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(cuk.vC)) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuk.vB)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 > 0;
   }

   public cuh a(cpw $$0, jc.a $$1) {
      int $$2 = 0;
      cuh $$3 = cuh.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(cuk.vC)) {
               if (!$$3.d()) {
                  return cuh.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuk.vB)) {
                  return cuh.i;
               }

               $$2++;
            }
         }
      }

      cya $$6 = $$3.a(ke.H);
      if (!$$3.d() && $$2 >= 1 && $$6 != null) {
         cya $$7 = $$6.b();
         if ($$7 == null) {
            return cuh.i;
         } else {
            cuh $$8 = $$3.c($$2);
            $$8.b(ke.H, $$7);
            return $$8;
         }
      } else {
         return cuh.i;
      }
   }

   public jj<cuh> a(cpw $$0) {
      jj<cuh> $$1 = jj.a($$0.b(), cuh.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuh $$3 = $$0.a($$2);
         if ($$3.f().u()) {
            $$1.set($$2, new cuh($$3.f().t()));
         } else if ($$3.f() instanceof cwo) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cze<?> ao_() {
      return cze.e;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
