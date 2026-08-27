public class fav extends ezl {
   private float a = 0.5F;

   public fav(vq $$0, eyz $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fav(int $$0, int $$1, vq $$2, eyz $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fav(int $$0, int $$1, int $$2, int $$3, vq $$4, eyz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fav b(int $$0) {
      super.a($$0);
      return this;
   }

   private fav b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fav d() {
      return this.b(0.0F);
   }

   public fav e() {
      return this.b(0.5F);
   }

   public fav f() {
      return this.b(1.0F);
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      vq $$4 = this.x();
      eyz $$5 = this.a();
      int $$6 = this.w();
      int $$7 = $$5.a($$4);
      int $$8 = this.B() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.C() + (this.u() - 9) / 2;
      avu $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private avu a(vq $$0, int $$1) {
      eyz $$2 = this.a();
      vv $$3 = $$2.a($$0, $$1 - $$2.a(vp.u));
      return sr.a().a(vv.a($$3, vp.u));
   }
}
