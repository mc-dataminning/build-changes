public class ftb extends fth {
   private static final int a = 3;
   private final fvz b;
   private final bnq D;
   private final bnq E;
   private int F;
   private final gay G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public ftb(gay $$0, fvz $$1, fqe $$2, bnq $$3, bnq $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dp());
   }

   private ftb(gay $$0, fvz $$1, fqe $$2, bnq $$3, bnq $$4, enz $$5) {
      super($$2, $$3.dr(), $$3.dt(), $$3.dx(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bnq a(bnq $$0) {
      return (bnq)(!($$0 instanceof cdw) ? $$0 : ((cdw)$$0).D());
   }

   @Override
   public ftl b() {
      return ftl.e;
   }

   @Override
   public void a(esl $$0, ewz $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = awi.d((double)$$2, this.K, this.H);
      double $$5 = awi.d((double)$$2, this.L, this.I);
      double $$6 = awi.d((double)$$2, this.M, this.J);
      double $$7 = awi.d((double)$$3, this.D.dr(), $$4);
      double $$8 = awi.d((double)$$3, this.D.dt(), $$5);
      double $$9 = awi.d((double)$$3, this.D.dx(), $$6);
      fvt.a $$10 = this.b.c();
      enz $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dC(), $$2, new esh(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.dr();
      this.I = (this.E.dt() + this.E.dv()) / 2.0;
      this.J = this.E.dx();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
