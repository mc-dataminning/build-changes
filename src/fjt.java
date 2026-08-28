public class fjt extends fij {
   private float a = 0.5F;

   public fjt(wz $$0, fhx $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fjt(int $$0, int $$1, wz $$2, fhx $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fjt(int $$0, int $$1, int $$2, int $$3, wz $$4, fhx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fjt b(int $$0) {
      super.a($$0);
      return this;
   }

   private fjt b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fjt c() {
      return this.b(0.0F);
   }

   public fjt e() {
      return this.b(0.5F);
   }

   public fjt f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      wz $$4 = this.z();
      fhx $$5 = this.a();
      int $$6 = this.y();
      int $$7 = $$5.a($$4);
      int $$8 = this.D() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.E() + (this.w() - 9) / 2;
      aya $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private aya a(wz $$0, int $$1) {
      fhx $$2 = this.a();
      xe $$3 = $$2.a($$0, $$1 - $$2.a(wy.u));
      return tw.a().a(xe.a($$3, wy.u));
   }
}
