public class fpq extends fpw {
   private static final int a = 3;
   private final fso b;
   private final blf D;
   private final blf E;
   private int F;
   private final fxm G;

   public fpq(fxm $$0, fso $$1, fmt $$2, blf $$3, blf $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dp());
   }

   private fpq(fxm $$0, fso $$1, fmt $$2, blf $$3, blf $$4, elb $$5) {
      super($$2, $$3.dr(), $$3.dt(), $$3.dx(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
   }

   private blf a(blf $$0) {
      return (blf)(!($$0 instanceof cbe) ? $$0 : ((cbe)$$0).D());
   }

   @Override
   public fqa b() {
      return fqa.e;
   }

   @Override
   public void a(eph $$0, etv $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = aty.d((double)$$2, this.E.ac, this.E.dr());
      double $$5 = aty.d((double)$$2, this.E.ad, (this.E.dt() + this.E.dv()) / 2.0);
      double $$6 = aty.d((double)$$2, this.E.ae, this.E.dx());
      double $$7 = aty.d((double)$$3, this.D.dr(), $$4);
      double $$8 = aty.d((double)$$3, this.D.dt(), $$5);
      double $$9 = aty.d((double)$$3, this.D.dx(), $$6);
      fsi.a $$10 = this.b.c();
      elb $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dC(), $$2, new epd(), $$10, this.G.a(this.D, $$2));
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
