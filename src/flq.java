public class flq extends flw {
   private static final int a = 3;
   private final fom b;
   private final bis D;
   private final bis E;
   private int F;
   private final fth G;

   public flq(fth $$0, fom $$1, fiz $$2, bis $$3, bis $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.do());
   }

   private flq(fth $$0, fom $$1, fiz $$2, bis $$3, bis $$4, ehp $$5) {
      super($$2, $$3.dq(), $$3.ds(), $$3.dw(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
   }

   private bis a(bis $$0) {
      return (bis)(!($$0 instanceof byp) ? $$0 : ((byp)$$0).C());
   }

   @Override
   public fma b() {
      return fma.e;
   }

   @Override
   public void a(elv $$0, eqi $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = ary.d((double)$$2, this.E.ac, this.E.dq());
      double $$5 = ary.d((double)$$2, this.E.ad, (this.E.ds() + this.E.du()) / 2.0);
      double $$6 = ary.d((double)$$2, this.E.ae, this.E.dw());
      double $$7 = ary.d((double)$$3, this.D.dq(), $$4);
      double $$8 = ary.d((double)$$3, this.D.ds(), $$5);
      double $$9 = ary.d((double)$$3, this.D.dw(), $$6);
      fog.a $$10 = this.b.b();
      ehp $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dB(), $$2, new elr(), $$10, this.G.a(this.D, $$2));
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
