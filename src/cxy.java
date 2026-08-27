public class cxy extends csq implements css {
   protected cxy(dfd.d $$0) {
      super($$0);
   }

   private static boolean b(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.c();
      dfe $$4 = $$1.a_($$3);
      int $$5 = dzy.a($$1, $$0, $$2, $$4, $$3, hc.b, $$4.b($$1, $$3));
      return $$5 < $$1.M();
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, csr.dW.n());
      }
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      dfe $$4 = $$0.a_($$2);
      gw $$5 = $$2.c();
      dhb $$6 = $$0.k().g();
      ht<dne<?, ?>> $$7 = $$0.B_().d(je.as);
      if ($$4.a(csr.ow)) {
         this.a($$7, or.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(csr.on)) {
         this.a($$7, or.j, $$0, $$6, $$1, $$5);
         this.a($$7, or.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, or.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ht<dne<?, ?>> $$0, aet<dne<?, ?>> $$1, akn $$2, dhb $$3, arx $$4, gw $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dne)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
