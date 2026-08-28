public class flv extends fkl {
   private float a = 0.5F;

   public flv(xe $$0, fjz $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public flv(int $$0, int $$1, xe $$2, fjz $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public flv(int $$0, int $$1, int $$2, int $$3, xe $$4, fjz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public flv b(int $$0) {
      super.a($$0);
      return this;
   }

   private flv b(float $$0) {
      this.a = $$0;
      return this;
   }

   public flv c() {
      return this.b(0.0F);
   }

   public flv e() {
      return this.b(0.5F);
   }

   public flv f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fkb $$0, int $$1, int $$2, float $$3) {
      xe $$4 = this.z();
      fjz $$5 = this.a();
      int $$6 = this.y();
      int $$7 = $$5.a($$4);
      int $$8 = this.D() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.E() + (this.w() - 9) / 2;
      ayr $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayr a(xe $$0, int $$1) {
      fjz $$2 = this.a();
      xj $$3 = $$2.a($$0, $$1 - $$2.a(xd.u));
      return ub.a().a(xj.a($$3, xd.u));
   }
}
