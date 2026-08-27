public abstract class dam extends daf {
   protected dam(dfi.d $$0) {
      super($$0);
   }

   private static boolean b(dfj $$0, cpy $$1, gw $$2) {
      gw $$3 = $$2.c();
      dfj $$4 = $$1.a_($$3);
      if ($$4.a(csw.dN) && $$4.c(dae.b) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = ead.a($$1, $$0, $$2, $$4, $$3, hc.b, $$4.b($$1, $$3));
         return $$5 < $$1.M();
      }
   }

   private static boolean c(dfj $$0, cpy $$1, gw $$2) {
      gw $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(apy.a);
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, csw.j.n());
      } else {
         if ($$1.z($$2.c()) >= 9) {
            dfj $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               gw $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(csw.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(a, Boolean.valueOf($$1.a_($$6.c()).a(csw.dN))));
               }
            }
         }
      }
   }
}
