public class fkv extends flb {
   private static final int a = 3;
   private final fnr b;
   private final bii D;
   private final bii E;
   private int F;
   private final fsm G;

   public fkv(fsm $$0, fnr $$1, fii $$2, bii $$3, bii $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dn());
   }

   private fkv(fsm $$0, fnr $$1, fii $$2, bii $$3, bii $$4, ehe $$5) {
      super($$2, $$3.dp(), $$3.dr(), $$3.dv(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
   }

   private bii a(bii $$0) {
      return (bii)(!($$0 instanceof byg) ? $$0 : ((byg)$$0).x());
   }

   @Override
   public flf b() {
      return flf.e;
   }

   @Override
   public void a(elk $$0, epx $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = arp.d((double)$$2, this.E.ac, this.E.dp());
      double $$5 = arp.d((double)$$2, this.E.ad, (this.E.dr() + this.E.dt()) / 2.0);
      double $$6 = arp.d((double)$$2, this.E.ae, this.E.dv());
      double $$7 = arp.d((double)$$3, this.D.dp(), $$4);
      double $$8 = arp.d((double)$$3, this.D.dr(), $$5);
      double $$9 = arp.d((double)$$3, this.D.dv(), $$6);
      fnl.a $$10 = this.b.b();
      ehe $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dA(), $$2, new elg(), $$10, this.G.a(this.D, $$2));
      $$10.b();
   }

   @Override
   public void a() {
      this.F++;
      if (this.F == 3) {
         this.k();
      }
   }
}
