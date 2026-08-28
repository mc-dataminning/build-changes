public class fnk extends fma {
   private float a = 0.5F;

   public fnk(xj $$0, flo $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fnk(int $$0, int $$1, xj $$2, flo $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fnk(int $$0, int $$1, int $$2, int $$3, xj $$4, flo $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fnk b(int $$0) {
      super.a($$0);
      return this;
   }

   private fnk b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fnk c() {
      return this.b(0.0F);
   }

   public fnk e() {
      return this.b(0.5F);
   }

   public fnk f() {
      return this.b(1.0F);
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      xj $$4 = this.z();
      flo $$5 = this.a();
      int $$6 = this.y();
      int $$7 = $$5.a($$4);
      int $$8 = this.D() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.E() + (this.w() - 9) / 2;
      ayy $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayy a(xj $$0, int $$1) {
      flo $$2 = this.a();
      xo $$3 = $$2.a($$0, $$1 - $$2.a(xi.u));
      return ug.a().a(xo.a($$3, xi.u));
   }
}
