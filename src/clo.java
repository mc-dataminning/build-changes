public class clo extends cle {
   public clo(cle.a $$0) {
      super($$0);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      dhi $$3 = $$1.a_($$2);
      if ($$3.a(arg.S)) {
         cdu $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bix.a($$1.B);
      } else {
         return bix.d;
      }
   }

   public static bix a(cdu $$0, csa $$1, ht $$2) {
      cah $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bli $$10 : $$1.a(
         bli.class, new ejp((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fU() == $$0) {
            if ($$3 == null) {
               $$3 = cah.b($$1, $$2);
               $$3.D();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(dls.b, $$2, dls.a.a($$0));
      }

      return $$4 ? bix.a : bix.d;
   }
}
