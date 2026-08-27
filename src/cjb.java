public class cjb extends cir {
   public cjb(cir.a $$0) {
      super($$0);
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      if ($$3.a(apj.S)) {
         cbl $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bgo.a($$1.B);
      } else {
         return bgo.d;
      }
   }

   public static bgo a(cbl $$0, cpk $$1, gv $$2) {
      bxy $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (biy $$10 : $$1.a(
         biy.class, new eha((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fP() == $$0) {
            if ($$3 == null) {
               $$3 = bxy.b($$1, $$2);
               $$3.x();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(dji.b, $$2, dji.a.a($$0));
      }

      return $$4 ? bgo.a : bgo.d;
   }
}
