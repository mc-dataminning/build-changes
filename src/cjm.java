public class cjm extends cjc {
   public cjm(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      if ($$3.a(apu.S)) {
         cbw $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bha.a($$1.B);
      } else {
         return bha.d;
      }
   }

   public static bha a(cbw $$0, cpx $$1, gw $$2) {
      byj $$3 = null;
      boolean $$4 = false;
      double $$5 = 7.0;
      int $$6 = $$2.u();
      int $$7 = $$2.v();
      int $$8 = $$2.w();

      for (bjk $$10 : $$1.a(
         bjk.class, new ehk((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0)
      )) {
         if ($$10.fS() == $$0) {
            if ($$3 == null) {
               $$3 = byj.b($$1, $$2);
               $$3.C();
            }

            $$10.b($$3, true);
            $$4 = true;
         }
      }

      if ($$4) {
         $$1.a(djv.b, $$2, djv.a.a($$0));
      }

      return $$4 ? bha.a : bha.d;
   }
}
