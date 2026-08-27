public class czv extends cyq {
   public czv(cyo $$0) {
      super($$0);
   }

   public boolean a(cpw $$0, dca $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cuh $$7 = $$0.a($$6);
         if (!$$7.d()) {
            if ($$7.a(dfe.cQ.q()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dfe.cR.q()) && !$$3) {
               $$3 = true;
            } else if (($$7.a(awm.O) || $$7.a(cuk.vT)) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cuk.qJ) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cuh a(cpw $$0, jc.a $$1) {
      cuh $$2 = new cuh(cuk.xF, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cuh $$4 = $$0.a($$3);
         if (!$$4.d()) {
            dnt $$5 = dnt.a($$4.f());
            if ($$5 != null) {
               $$2.b(ke.F, $$5.getSuspiciousEffects());
               break;
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cze<?> ao_() {
      return cze.o;
   }
}
