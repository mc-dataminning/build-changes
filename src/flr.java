public class flr extends fkh {
   private float a = 0.5F;

   public flr(xd $$0, fjv $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public flr(int $$0, int $$1, xd $$2, fjv $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public flr(int $$0, int $$1, int $$2, int $$3, xd $$4, fjv $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public flr b(int $$0) {
      super.a($$0);
      return this;
   }

   private flr b(float $$0) {
      this.a = $$0;
      return this;
   }

   public flr c() {
      return this.b(0.0F);
   }

   public flr e() {
      return this.b(0.5F);
   }

   public flr f() {
      return this.b(1.0F);
   }

   @Override
   public void b(fjx $$0, int $$1, int $$2, float $$3) {
      xd $$4 = this.z();
      fjv $$5 = this.a();
      int $$6 = this.y();
      int $$7 = $$5.a($$4);
      int $$8 = this.D() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.E() + (this.w() - 9) / 2;
      ayp $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private ayp a(xd $$0, int $$1) {
      fjv $$2 = this.a();
      xi $$3 = $$2.a($$0, $$1 - $$2.a(xc.u));
      return ua.a().a(xi.a($$3, xc.u));
   }
}
