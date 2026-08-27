public class flj extends flp {
   private static final int a = 3;
   private final fof b;
   private final bil D;
   private final bil E;
   private int F;
   private final fta G;

   public flj(fta $$0, fof $$1, fis $$2, bil $$3, bil $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dn());
   }

   private flj(fta $$0, fof $$1, fis $$2, bil $$3, bil $$4, ehi $$5) {
      super($$2, $$3.dp(), $$3.dr(), $$3.dv(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
   }

   private bil a(bil $$0) {
      return (bil)(!($$0 instanceof byi) ? $$0 : ((byi)$$0).x());
   }

   @Override
   public flt b() {
      return flt.e;
   }

   @Override
   public void a(elo $$0, eqb $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = ars.d((double)$$2, this.E.ac, this.E.dp());
      double $$5 = ars.d((double)$$2, this.E.ad, (this.E.dr() + this.E.dt()) / 2.0);
      double $$6 = ars.d((double)$$2, this.E.ae, this.E.dv());
      double $$7 = ars.d((double)$$3, this.D.dp(), $$4);
      double $$8 = ars.d((double)$$3, this.D.dr(), $$5);
      double $$9 = ars.d((double)$$3, this.D.dv(), $$6);
      fnz.a $$10 = this.b.b();
      ehi $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dA(), $$2, new elk(), $$10, this.G.a(this.D, $$2));
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
