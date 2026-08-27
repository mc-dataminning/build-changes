public class cko extends cke {
   public cko(cke.a $$0) {
      super($$0);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      if ($$3.a(aqs.S)) {
         ccx $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bib.a($$1.B);
      } else {
         return bib.d;
      }
   }

   public static bib a(ccx $$0, cqz $$1, ht $$2) {
      bzk $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bkl $$10 : $$1.a(
         bkl.class, new eia((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fT() == $$0) {
            if ($$3 == null) {
               $$3 = bzk.b($$1, $$2);
               $$3.C();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(dkl.b, $$2, dkl.a.a($$0));
      }

      return $$4 ? bib.a : bib.d;
   }
}
