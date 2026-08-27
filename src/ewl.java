public class ewl extends evb {
   private float a = 0.5F;

   public ewl(uv $$0, eur $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public ewl(int $$0, int $$1, uv $$2, eur $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public ewl(int $$0, int $$1, int $$2, int $$3, uv $$4, eur $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.i = false;
   }

   public ewl i(int $$0) {
      super.a($$0);
      return this;
   }

   private ewl b(float $$0) {
      this.a = $$0;
      return this;
   }

   public ewl e() {
      return this.b(0.0F);
   }

   public ewl f() {
      return this.b(0.5F);
   }

   public ewl g() {
      return this.b(1.0F);
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      uv $$4 = this.l();
      eur $$5 = this.a();
      int $$6 = this.k();
      int $$7 = $$5.a($$4);
      int $$8 = this.p() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.r() + (this.i() - 9) / 2;
      atc $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private atc a(uv $$0, int $$1) {
      eur $$2 = this.a();
      va $$3 = $$2.a($$0, $$1 - $$2.a(uu.t));
      return ry.a().a(va.a($$3, uu.t));
   }
}
