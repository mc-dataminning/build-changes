public class cjf extends civ {
   public cjf(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      if ($$3.a(apo.S)) {
         cbp $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bgt.a($$1.B);
      } else {
         return bgt.d;
      }
   }

   public static bgt a(cbp $$0, cpq $$1, gw $$2) {
      byc $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bjd $$10 : $$1.a(
         bjd.class, new ehd((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fP() == $$0) {
            if ($$3 == null) {
               $$3 = byc.b($$1, $$2);
               $$3.x();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(djo.b, $$2, djo.a.a($$0));
      }

      return $$4 ? bgt.a : bgt.d;
   }
}
