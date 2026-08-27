public class cjc extends cis {
   public cjc(cis.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      dez $$3 = $$1.a_($$2);
      if ($$3.a(apl.S)) {
         cbm $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   public static bgq a(cbm $$0, cpl $$1, gu $$2) {
      bxz $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bja $$10 : $$1.a(
         bja.class, new egy((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fP() == $$0) {
            if ($$3 == null) {
               $$3 = bxz.b($$1, $$2);
               $$3.x();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(djj.b, $$2, djj.a.a($$0));
      }

      return $$4 ? bgq.a : bgq.d;
   }
}
