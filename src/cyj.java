public class cyj extends cyq {
   public cyj(cyo $$0) {
      super($$0);
   }

   public boolean a(cpw $$0, dca $$1) {
      csy $$2 = null;
      cuh $$3 = null;
      cuh $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cuh $$6 = $$0.a($$5);
         if (!$$6.d()) {
            cuc $$7 = $$6.f();
            if (!($$7 instanceof crz)) {
               return false;
            }

            crz $$8 = (crz)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(ke.W, dps.a).b().size();
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public cuh a(cpw $$0, jc.a $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cuh $$3 = $$0.a($$2);
         if (!$$3.d()) {
            int $$4 = $$3.a(ke.W, dps.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cuh.i;
   }

   public jj<cuh> a(cpw $$0) {
      jj<cuh> $$1 = jj.a($$0.b(), cuh.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuh $$3 = $$0.a($$2);
         if (!$$3.d()) {
            if ($$3.f().u()) {
               $$1.set($$2, new cuh($$3.f().t()));
            } else if (!$$3.a(ke.W, dps.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cze<?> ao_() {
      return cze.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
