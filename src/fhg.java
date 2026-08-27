public class fhg extends ffw {
   private float a = 0.5F;

   public fhg(wx $$0, ffk $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fhg(int $$0, int $$1, wx $$2, ffk $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fhg(int $$0, int $$1, int $$2, int $$3, wx $$4, ffk $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fhg b(int $$0) {
      super.a($$0);
      return this;
   }

   private fhg b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fhg d() {
      return this.b(0.0F);
   }

   public fhg e() {
      return this.b(0.5F);
   }

   public fhg f() {
      return this.b(1.0F);
   }

   @Override
   public void b(ffm $$0, int $$1, int $$2, float $$3) {
      wx $$4 = this.y();
      ffk $$5 = this.a();
      int $$6 = this.x();
      int $$7 = $$5.a($$4);
      int $$8 = this.C() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.D() + (this.v() - 9) / 2;
      axq $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private axq a(wx $$0, int $$1) {
      ffk $$2 = this.a();
      xc $$3 = $$2.a($$0, $$1 - $$2.a(ww.u));
      return ty.a().a(xc.a($$3, ww.u));
   }
}
