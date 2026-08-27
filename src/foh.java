public class foh extends fon {
   private static final int a = 3;
   private final frf b;
   private final bkv D;
   private final bkv E;
   private int F;
   private final fwa G;

   public foh(fwa $$0, frf $$1, flo $$2, bkv $$3, bkv $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dq());
   }

   private foh(fwa $$0, frf $$1, flo $$2, bkv $$3, bkv $$4, ejz $$5) {
      super($$2, $$3.ds(), $$3.du(), $$3.dy(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
   }

   private bkv a(bkv $$0) {
      return (bkv)(!($$0 instanceof cas) ? $$0 : ((cas)$$0).D());
   }

   @Override
   public fos b() {
      return fos.e;
   }

   @Override
   public void a(eof $$0, est $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = atq.d((double)$$2, this.E.ac, this.E.ds());
      double $$5 = atq.d((double)$$2, this.E.ad, (this.E.du() + this.E.dw()) / 2.0);
      double $$6 = atq.d((double)$$2, this.E.ae, this.E.dy());
      double $$7 = atq.d((double)$$3, this.D.ds(), $$4);
      double $$8 = atq.d((double)$$3, this.D.du(), $$5);
      double $$9 = atq.d((double)$$3, this.D.dy(), $$6);
      fqz.a $$10 = this.b.c();
      ejz $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dD(), $$2, new eob(), $$10, this.G.a(this.D, $$2));
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
