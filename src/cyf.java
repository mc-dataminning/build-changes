public class cyf extends cxm {
   public cyf(cxk $$0) {
      super($$0);
   }

   public boolean a(cpj $$0, dax $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (ddy.a($$5.g()) instanceof dkx) {
               $$2++;
            } else {
               if (!($$5.g() instanceof csi)) {
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

   public cto a(cpj $$0, iz.a $$1) {
      cto $$2 = cto.i;
      csi $$3 = (csi)ctr.ri;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            ctj $$6 = $$5.g();
            if (ddy.a($$6) instanceof dkx) {
               $$2 = $$5;
            } else if ($$6 instanceof csi) {
               $$3 = (csi)$$6;
            }
         }
      }

      ddy $$7 = dkx.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cxy<?> ao_() {
      return cxy.m;
   }
}
