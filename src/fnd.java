public class fnd extends flt {
   private float a = 0.5F;

   public fnd(xl $$0, flh $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fnd(int $$0, int $$1, xl $$2, flh $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fnd(int $$0, int $$1, int $$2, int $$3, xl $$4, flh $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fnd b(int $$0) {
      super.a($$0);
      return this;
   }

   private fnd b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fnd c() {
      return this.b(0.0F);
   }

   public fnd e() {
      return this.b(0.5F);
   }

   public fnd f() {
      return this.b(1.0F);
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      xl $$4 = this.z();
      flh $$5 = this.a();
      int $$6 = this.y();
      int $$7 = $$5.a($$4);
      int $$8 = this.D() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.E() + (this.w() - 9) / 2;
      ayz $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayz a(xl $$0, int $$1) {
      flh $$2 = this.a();
      xq $$3 = $$2.a($$0, $$1 - $$2.a(xk.u));
      return ui.a().a(xq.a($$3, xk.u));
   }
}
