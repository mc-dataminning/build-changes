public class fiz extends fhp {
   private float a = 0.5F;

   public fiz(wu $$0, fhd $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fiz(int $$0, int $$1, wu $$2, fhd $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fiz(int $$0, int $$1, int $$2, int $$3, wu $$4, fhd $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fiz b(int $$0) {
      super.a($$0);
      return this;
   }

   private fiz b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fiz c() {
      return this.b(0.0F);
   }

   public fiz e() {
      return this.b(0.5F);
   }

   public fiz f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      wu $$4 = this.z();
      fhd $$5 = this.a();
      int $$6 = this.y();
      int $$7 = $$5.a($$4);
      int $$8 = this.D() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.E() + (this.w() - 9) / 2;
      axs $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private axs a(wu $$0, int $$1) {
      fhd $$2 = this.a();
      wz $$3 = $$2.a($$0, $$1 - $$2.a(wt.u));
      return ts.a().a(wz.a($$3, wt.u));
   }
}
