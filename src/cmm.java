public class cmm extends cmc {
   public cmm(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      if ($$3.a(arr.S)) {
         cer $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bjl.a($$1.B);
      } else {
         return bjl.d;
      }
   }

   public static bjl a(cer $$0, csy $$1, hv $$2) {
      cay $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (blx $$10 : $$1.a(
         blx.class, new ekw((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fT() == $$0) {
            if ($$3 == null) {
               $$3 = cay.b($$1, $$2);
               $$3.D();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(dmz.b, $$2, dmz.a.a($$0));
      }

      return $$4 ? bjl.a : bjl.d;
   }
}
