public class fty extends fue {
   private static final int a = 3;
   private final fww b;
   private final bof D;
   private final bof E;
   private int F;
   private final gbw G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public fty(gbw $$0, fww $$1, fra $$2, bof $$3, bof $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dm());
   }

   private fty(gbw $$0, fww $$1, fra $$2, bof $$3, bof $$4, eov $$5) {
      super($$2, $$3.do(), $$3.dq(), $$3.du(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bof a(bof $$0) {
      return (bof)(!($$0 instanceof cel) ? $$0 : ((cel)$$0).D());
   }

   @Override
   public fui b() {
      return fui.e;
   }

   @Override
   public void a(eth $$0, exv $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = awm.d((double)$$2, this.K, this.H);
      double $$5 = awm.d((double)$$2, this.L, this.I);
      double $$6 = awm.d((double)$$2, this.M, this.J);
      double $$7 = awm.d((double)$$3, this.D.do(), $$4);
      double $$8 = awm.d((double)$$3, this.D.dq(), $$5);
      double $$9 = awm.d((double)$$3, this.D.du(), $$6);
      fwq.a $$10 = this.b.c();
      eov $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dz(), $$2, new etd(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.do();
      this.I = (this.E.dq() + this.E.ds()) / 2.0;
      this.J = this.E.du();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
