public class cyd extends csv implements csx {
   protected cyd(dfi.d $$0) {
      super($$0);
   }

   private static boolean b(dfj $$0, cpy $$1, gw $$2) {
      gw $$3 = $$2.c();
      dfj $$4 = $$1.a_($$3);
      int $$5 = ead.a($$1, $$0, $$2, $$4, $$3, hc.b, $$4.b($$1, $$3));
      return $$5 < $$1.M();
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, csw.dW.n());
      }
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akr $$0, asc $$1, gw $$2, dfj $$3) {
      dfj $$4 = $$0.a_($$2);
      gw $$5 = $$2.c();
      dhg $$6 = $$0.k().g();
      ht<dnj<?, ?>> $$7 = $$0.G_().d(je.as);
      if ($$4.a(csw.ow)) {
         this.a($$7, ou.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(csw.on)) {
         this.a($$7, ou.j, $$0, $$6, $$1, $$5);
         this.a($$7, ou.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, ou.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ht<dnj<?, ?>> $$0, aew<dnj<?, ?>> $$1, akr $$2, dhg $$3, asc $$4, gw $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dnj)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
