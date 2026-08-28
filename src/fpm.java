public class fpm extends fob {
   private float a = 0.5F;

   public fpm(xv $$0, fnp $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fpm(int $$0, int $$1, xv $$2, fnp $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fpm(int $$0, int $$1, int $$2, int $$3, xv $$4, fnp $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fpm b(int $$0) {
      super.a($$0);
      return this;
   }

   private fpm b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fpm c() {
      return this.b(0.0F);
   }

   public fpm e() {
      return this.b(0.5F);
   }

   public fpm g() {
      return this.b(1.0F);
   }

   @Override
   public void b(fnr $$0, int $$1, int $$2, float $$3) {
      xv $$4 = this.z();
      fnp $$5 = this.a();
      int $$6 = this.y();
      int $$7 = $$5.a($$4);
      int $$8 = this.D() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.E() + (this.w() - 9) / 2;
      azq $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private azq a(xv $$0, int $$1) {
      fnp $$2 = this.a();
      ya $$3 = $$2.a($$0, $$1 - $$2.a(xu.u));
      return us.a().a(ya.a($$3, xu.u));
   }
}
