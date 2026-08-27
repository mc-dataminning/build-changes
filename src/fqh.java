public class fqh extends fqn {
   private static final int a = 3;
   private final ftf b;
   private final blp D;
   private final blp E;
   private int F;
   private final fyd G;

   public fqh(fyd $$0, ftf $$1, fnk $$2, blp $$3, blp $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dp());
   }

   private fqh(fyd $$0, ftf $$1, fnk $$2, blp $$3, blp $$4, elm $$5) {
      super($$2, $$3.dr(), $$3.dt(), $$3.dx(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
   }

   private blp a(blp $$0) {
      return (blp)(!($$0 instanceof cbo) ? $$0 : ((cbo)$$0).D());
   }

   @Override
   public fqr b() {
      return fqr.e;
   }

   @Override
   public void a(epx $$0, eul $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = aui.d((double)$$2, this.E.ac, this.E.dr());
      double $$5 = aui.d((double)$$2, this.E.ad, (this.E.dt() + this.E.dv()) / 2.0);
      double $$6 = aui.d((double)$$2, this.E.ae, this.E.dx());
      double $$7 = aui.d((double)$$3, this.D.dr(), $$4);
      double $$8 = aui.d((double)$$3, this.D.dt(), $$5);
      double $$9 = aui.d((double)$$3, this.D.dx(), $$6);
      fsz.a $$10 = this.b.c();
      elm $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dC(), $$2, new ept(), $$10, this.G.a(this.D, $$2));
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
