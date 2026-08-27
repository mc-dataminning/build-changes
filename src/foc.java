public class foc extends foi {
   private static final int a = 3;
   private final fra b;
   private final bkq D;
   private final bkq E;
   private int F;
   private final fvv G;

   public foc(fvv $$0, fra $$1, flj $$2, bkq $$3, bkq $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dq());
   }

   private foc(fvv $$0, fra $$1, flj $$2, bkq $$3, bkq $$4, eju $$5) {
      super($$2, $$3.ds(), $$3.du(), $$3.dy(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
   }

   private bkq a(bkq $$0) {
      return (bkq)(!($$0 instanceof can) ? $$0 : ((can)$$0).D());
   }

   @Override
   public fom b() {
      return fom.e;
   }

   @Override
   public void a(eoa $$0, eso $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = atm.d((double)$$2, this.E.ac, this.E.ds());
      double $$5 = atm.d((double)$$2, this.E.ad, (this.E.du() + this.E.dw()) / 2.0);
      double $$6 = atm.d((double)$$2, this.E.ae, this.E.dy());
      double $$7 = atm.d((double)$$3, this.D.ds(), $$4);
      double $$8 = atm.d((double)$$3, this.D.du(), $$5);
      double $$9 = atm.d((double)$$3, this.D.dy(), $$6);
      fqu.a $$10 = this.b.c();
      eju $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dD(), $$2, new enw(), $$10, this.G.a(this.D, $$2));
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
