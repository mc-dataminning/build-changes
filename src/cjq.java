public class cjq extends cjg {
   public cjq(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfd $$3 = $$1.a_($$2);
      if ($$3.a(apv.S)) {
         cca $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bhe.a($$1.B);
      } else {
         return bhe.d;
      }
   }

   public static bhe a(cca $$0, cqb $$1, gw $$2) {
      byn $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bjo $$10 : $$1.a(
         bjo.class, new ehc((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fT() == $$0) {
            if ($$3 == null) {
               $$3 = byn.b($$1, $$2);
               $$3.C();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(djn.b, $$2, djn.a.a($$0));
      }

      return $$4 ? bhe.a : bhe.d;
   }
}
