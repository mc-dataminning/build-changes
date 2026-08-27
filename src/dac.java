public class dac extends csm {
   private static final ehx a = csm.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int b = 14;
   private static final int c = 10;
   private static final int d = 10;

   public dac(dez.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return csm.a($$1, $$2.c(), ha.a) && !$$1.y($$2);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1 == ha.b && !this.a($$0, $$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(iv.at, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      gu.a $$10 = new gu.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + arp.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + arp.a($$3, -10, 10));
         dfa $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(iv.ax, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return a;
   }
}
