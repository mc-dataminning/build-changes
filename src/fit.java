public class fit extends fhj {
   private float a = 0.5F;

   public fit(wu $$0, fgx $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fit(int $$0, int $$1, wu $$2, fgx $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fit(int $$0, int $$1, int $$2, int $$3, wu $$4, fgx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fit b(int $$0) {
      super.a($$0);
      return this;
   }

   private fit b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fit c() {
      return this.b(0.0F);
   }

   public fit e() {
      return this.b(0.5F);
   }

   public fit f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      wu $$4 = this.z();
      fgx $$5 = this.a();
      int $$6 = this.y();
      int $$7 = $$5.a($$4);
      int $$8 = this.D() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.E() + (this.w() - 9) / 2;
      axq $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private axq a(wu $$0, int $$1) {
      fgx $$2 = this.a();
      wz $$3 = $$2.a($$0, $$1 - $$2.a(wt.u));
      return ts.a().a(wz.a($$3, wt.u));
   }
}
