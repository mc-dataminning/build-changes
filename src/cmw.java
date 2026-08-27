public class cmw extends cmm {
   public cmw(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      dja $$3 = $$1.a_($$2);
      if ($$3.a(asb.S)) {
         cfb $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bjv.a($$1.B);
      } else {
         return bjv.d;
      }
   }

   public static bjv a(cfb $$0, cti $$1, hx $$2) {
      cbi $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bmh $$10 : $$1.a(
         bmh.class, new elh((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fT() == $$0) {
            if ($$3 == null) {
               $$3 = cbi.b($$1, $$2);
               $$3.D();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(dnk.b, $$2, dnk.a.a($$0));
      }

      return $$4 ? bjv.a : bjv.d;
   }
}
