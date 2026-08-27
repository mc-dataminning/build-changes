public class fcp extends fbf {
   private float a = 0.5F;

   public fcp(vu $$0, fat $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fcp(int $$0, int $$1, vu $$2, fat $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fcp(int $$0, int $$1, int $$2, int $$3, vu $$4, fat $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fcp b(int $$0) {
      super.a($$0);
      return this;
   }

   private fcp b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fcp d() {
      return this.b(0.0F);
   }

   public fcp e() {
      return this.b(0.5F);
   }

   public fcp f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
      vu $$4 = this.x();
      fat $$5 = this.a();
      int $$6 = this.w();
      int $$7 = $$5.a($$4);
      int $$8 = this.B() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.C() + (this.u() - 9) / 2;
      awi $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private awi a(vu $$0, int $$1) {
      fat $$2 = this.a();
      vz $$3 = $$2.a($$0, $$1 - $$2.a(vt.u));
      return sv.a().a(vz.a($$3, vt.u));
   }
}
