public class fru extends fqj {
   private float a = 0.5F;

   public fru(wv $$0, fpx $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fru(int $$0, int $$1, wv $$2, fpx $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fru(int $$0, int $$1, int $$2, int $$3, wv $$4, fpx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fru b(int $$0) {
      super.a($$0);
      return this;
   }

   private fru b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fru c() {
      return this.b(0.0F);
   }

   public fru e() {
      return this.b(0.5F);
   }

   public fru g() {
      return this.b(1.0F);
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      wv $$4 = this.B();
      fpx $$5 = this.a();
      int $$6 = this.A();
      int $$7 = $$5.a($$4);
      int $$8 = this.F() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.G() + (this.y() - 9) / 2;
      ayw $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayw a(wv $$0, int $$1) {
      fpx $$2 = this.a();
      xa $$3 = $$2.a($$0, $$1 - $$2.a(wu.u));
      return tr.a().a(xa.a($$3, wu.u));
   }
}
