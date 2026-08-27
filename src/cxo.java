public class cxo extends cwv {
   public cxo(cwt $$0) {
      super($$0);
   }

   public boolean a(cou $$0, dad $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if (dde.a($$5.f()) instanceof dkd) {
               $$2++;
            } else {
               if (!($$5.f() instanceof crt)) {
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

   public csz a(cou $$0, iy.a $$1) {
      csz $$2 = csz.i;
      crt $$3 = (crt)ctc.ri;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            csu $$6 = $$5.f();
            if (dde.a($$6) instanceof dkd) {
               $$2 = $$5;
            } else if ($$6 instanceof crt) {
               $$3 = (crt)$$6;
            }
         }
      }

      dde $$7 = dkd.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cxh<?> ao_() {
      return cxh.m;
   }
}
