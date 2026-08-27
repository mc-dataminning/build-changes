public class fkq extends fkw {
   private static final int a = 3;
   private final fnm b;
   private final big D;
   private final big E;
   private int F;
   private final fsh G;

   public fkq(fsh $$0, fnm $$1, fie $$2, big $$3, big $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dn());
   }

   private fkq(fsh $$0, fnm $$1, fie $$2, big $$3, big $$4, ehf $$5) {
      super($$2, $$3.dp(), $$3.dr(), $$3.dv(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
   }

   private big a(big $$0) {
      return (big)(!($$0 instanceof bye) ? $$0 : ((bye)$$0).x());
   }

   @Override
   public fla b() {
      return fla.e;
   }

   @Override
   public void a(ell $$0, epy $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = aro.d((double)$$2, this.E.ac, this.E.dp());
      double $$5 = aro.d((double)$$2, this.E.ad, (this.E.dr() + this.E.dt()) / 2.0);
      double $$6 = aro.d((double)$$2, this.E.ae, this.E.dv());
      double $$7 = aro.d((double)$$3, this.D.dp(), $$4);
      double $$8 = aro.d((double)$$3, this.D.dr(), $$5);
      double $$9 = aro.d((double)$$3, this.D.dv(), $$6);
      fng.a $$10 = this.b.b();
      ehf $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dA(), $$2, new elh(), $$10, this.G.a(this.D, $$2));
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
