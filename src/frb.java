public class frb extends frh {
   private static final int a = 3;
   private final ftz b;
   private final blw D;
   private final blw E;
   private int F;
   private final fyy G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public frb(fyy $$0, ftz $$1, foe $$2, blw $$3, blw $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.do());
   }

   private frb(fyy $$0, ftz $$1, foe $$2, blw $$3, blw $$4, emc $$5) {
      super($$2, $$3.dq(), $$3.ds(), $$3.dw(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private blw a(blw $$0) {
      return (blw)(!($$0 instanceof ccb) ? $$0 : ((ccb)$$0).D());
   }

   @Override
   public frl b() {
      return frl.e;
   }

   @Override
   public void a(eqo $$0, evc $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = aup.d((double)$$2, this.K, this.H);
      double $$5 = aup.d((double)$$2, this.L, this.I);
      double $$6 = aup.d((double)$$2, this.M, this.J);
      double $$7 = aup.d((double)$$3, this.D.dq(), $$4);
      double $$8 = aup.d((double)$$3, this.D.ds(), $$5);
      double $$9 = aup.d((double)$$3, this.D.dw(), $$6);
      ftt.a $$10 = this.b.c();
      emc $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dB(), $$2, new eqk(), $$10, this.G.a(this.D, $$2));
      $$10.b();
   }

   @Override
   public void a() {
      this.F++;
      if (this.F == 3) {
         this.k();
      }

      this.d();
      this.c();
   }

   private void c() {
      this.H = this.E.dq();
      this.I = (this.E.ds() + this.E.du()) / 2.0;
      this.J = this.E.dw();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
