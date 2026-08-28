public class fij extends fgz {
   private float a = 0.5F;

   public fij(xo $$0, fgn $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fij(int $$0, int $$1, xo $$2, fgn $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fij(int $$0, int $$1, int $$2, int $$3, xo $$4, fgn $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fij b(int $$0) {
      super.a($$0);
      return this;
   }

   private fij b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fij d() {
      return this.b(0.0F);
   }

   public fij e() {
      return this.b(0.5F);
   }

   public fij f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fgp $$0, int $$1, int $$2, float $$3) {
      xo $$4 = this.y();
      fgn $$5 = this.a();
      int $$6 = this.x();
      int $$7 = $$5.a($$4);
      int $$8 = this.C() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.D() + (this.v() - 9) / 2;
      ayj $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayj a(xo $$0, int $$1) {
      fgn $$2 = this.a();
      xt $$3 = $$2.a($$0, $$1 - $$2.a(xn.u));
      return um.a().a(xt.a($$3, xn.u));
   }
}
