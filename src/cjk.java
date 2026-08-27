public class cjk extends cja {
   public cjk(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfj $$3 = $$1.a_($$2);
      if ($$3.a(apt.S)) {
         cbu $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bgy.a($$1.B);
      } else {
         return bgy.d;
      }
   }

   public static bgy a(cbu $$0, cpv $$1, gw $$2) {
      byh $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bji $$10 : $$1.a(
         bji.class, new ehi((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fS() == $$0) {
            if ($$3 == null) {
               $$3 = byh.b($$1, $$2);
               $$3.C();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(djt.b, $$2, djt.a.a($$0));
      }

      return $$4 ? bgy.a : bgy.d;
   }
}
