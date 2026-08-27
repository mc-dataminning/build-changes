public class cjd extends cit {
   public cjd(cit.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(cli $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dfa $$3 = $$1.a_($$2);
      if ($$3.a(apl.S)) {
         cbn $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   public static bgq a(cbn $$0, cpm $$1, gu $$2) {
      bya $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bja $$10 : $$1.a(
         bja.class, new egz((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fP() == $$0) {
            if ($$3 == null) {
               $$3 = bya.b($$1, $$2);
               $$3.x();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(djk.b, $$2, djk.a.a($$0));
      }

      return $$4 ? bgq.a : bgq.d;
   }
}
