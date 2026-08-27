public class flo extends flu {
   private static final int a = 3;
   private final fok b;
   private final biq D;
   private final biq E;
   private int F;
   private final ftf G;

   public flo(ftf $$0, fok $$1, fix $$2, biq $$3, biq $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.do());
   }

   private flo(ftf $$0, fok $$1, fix $$2, biq $$3, biq $$4, ehn $$5) {
      super($$2, $$3.dq(), $$3.ds(), $$3.dw(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
   }

   private biq a(biq $$0) {
      return (biq)(!($$0 instanceof byn) ? $$0 : ((byn)$$0).C());
   }

   @Override
   public fly b() {
      return fly.e;
   }

   @Override
   public void a(elt $$0, eqg $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = arx.d((double)$$2, this.E.ac, this.E.dq());
      double $$5 = arx.d((double)$$2, this.E.ad, (this.E.ds() + this.E.du()) / 2.0);
      double $$6 = arx.d((double)$$2, this.E.ae, this.E.dw());
      double $$7 = arx.d((double)$$3, this.D.dq(), $$4);
      double $$8 = arx.d((double)$$3, this.D.ds(), $$5);
      double $$9 = arx.d((double)$$3, this.D.dw(), $$6);
      foe.a $$10 = this.b.b();
      ehn $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dB(), $$2, new elp(), $$10, this.G.a(this.D, $$2));
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
