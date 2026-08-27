public class fgl extends ffb {
   private float a = 0.5F;

   public fgl(wu $$0, fep $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fgl(int $$0, int $$1, wu $$2, fep $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fgl(int $$0, int $$1, int $$2, int $$3, wu $$4, fep $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fgl b(int $$0) {
      super.a($$0);
      return this;
   }

   private fgl b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fgl d() {
      return this.b(0.0F);
   }

   public fgl e() {
      return this.b(0.5F);
   }

   public fgl f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fer $$0, int $$1, int $$2, float $$3) {
      wu $$4 = this.y();
      fep $$5 = this.a();
      int $$6 = this.x();
      int $$7 = $$5.a($$4);
      int $$8 = this.C() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.D() + (this.v() - 9) / 2;
      axl $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private axl a(wu $$0, int $$1) {
      fep $$2 = this.a();
      wz $$3 = $$2.a($$0, $$1 - $$2.a(wt.u));
      return tv.a().a(wz.a($$3, wt.u));
   }
}
