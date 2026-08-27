public class clg extends ckw {
   public clg(ckw.a $$0) {
      super($$0);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      if ($$3.a(arc.S)) {
         cdm $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return biq.a($$1.B);
      } else {
         return biq.d;
      }
   }

   public static biq a(cdm $$0, crs $$1, ht $$2) {
      bzz $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bla $$10 : $$1.a(
         bla.class, new ejd((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fT() == $$0) {
            if ($$3 == null) {
               $$3 = bzz.b($$1, $$2);
               $$3.C();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(dlg.b, $$2, dlg.a.a($$0));
      }

      return $$4 ? biq.a : biq.d;
   }
}
