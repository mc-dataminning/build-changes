public class fju extends fik {
   private float a = 0.5F;

   public fju(xe $$0, fhy $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fju(int $$0, int $$1, xe $$2, fhy $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fju(int $$0, int $$1, int $$2, int $$3, xe $$4, fhy $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fju b(int $$0) {
      super.a($$0);
      return this;
   }

   private fju b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fju d() {
      return this.b(0.0F);
   }

   public fju e() {
      return this.b(0.5F);
   }

   public fju f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      xe $$4 = this.y();
      fhy $$5 = this.a();
      int $$6 = this.x();
      int $$7 = $$5.a($$4);
      int $$8 = this.C() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.D() + (this.v() - 9) / 2;
      axy $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private axy a(xe $$0, int $$1) {
      fhy $$2 = this.a();
      xj $$3 = $$2.a($$0, $$1 - $$2.a(xd.u));
      return uf.a().a(xj.a($$3, xd.u));
   }
}
