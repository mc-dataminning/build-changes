public class cow extends cpd {
   public cow(cpb $$0) {
      super($$0);
   }

   public boolean a(cia $$0, csy $$1) {
      ckv $$2 = null;
      cmh $$3 = null;
      cmh $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cmh $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cmc $$7 = $$6.d();
            if (!($$7 instanceof cjx)) {
               return false;
            }

            cjx $$8 = (cjx)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = dft.c($$6);
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

   public cmh a(cia $$0, is $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cmh $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = dft.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cmh.f;
   }

   public io<cmh> a(cia $$0) {
      io<cmh> $$1 = io.a($$0.b(), cmh.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cmh $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new cmh($$3.d().s()));
            } else if ($$3.u() && dft.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cpp<?> ar_() {
      return cpp.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
