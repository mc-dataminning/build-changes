public class cnd extends cmt {
   public cnd(cmt.a $$0) {
      super($$0);
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      djh $$3 = $$1.a_($$2);
      if ($$3.a(ash.S)) {
         cfi $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bkb.a($$1.B);
      } else {
         return bkb.d;
      }
   }

   public static bkb a(cfi $$0, ctp $$1, hx $$2) {
      cbo $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bmn $$10 : $$1.a(
         bmn.class, new elo((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fT() == $$0) {
            if ($$3 == null) {
               $$3 = cbo.b($$1, $$2);
               $$3.D();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(dnr.b, $$2, dnr.a.a($$0));
      }

      return $$4 ? bkb.a : bkb.d;
   }
}
