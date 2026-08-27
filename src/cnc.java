public class cnc extends cms {
   public cnc(cms.a $$0) {
      super($$0);
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      djg $$3 = $$1.a_($$2);
      if ($$3.a(asg.S)) {
         cfh $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bka.a($$1.B);
      } else {
         return bka.d;
      }
   }

   public static bka a(cfh $$0, cto $$1, hx $$2) {
      cbn $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bmm $$10 : $$1.a(
         bmm.class, new eln((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fT() == $$0) {
            if ($$3 == null) {
               $$3 = cbn.b($$1, $$2);
               $$3.D();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(dnq.b, $$2, dnq.a.a($$0));
      }

      return $$4 ? bka.a : bka.d;
   }
}
