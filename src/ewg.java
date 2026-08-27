public class ewg extends euw {
   private float a = 0.5F;

   public ewg(ur $$0, eum $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public ewg(int $$0, int $$1, ur $$2, eum $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public ewg(int $$0, int $$1, int $$2, int $$3, ur $$4, eum $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.i = false;
   }

   public ewg i(int $$0) {
      super.a($$0);
      return this;
   }

   private ewg b(float $$0) {
      this.a = $$0;
      return this;
   }

   public ewg e() {
      return this.b(0.0F);
   }

   public ewg f() {
      return this.b(0.5F);
   }

   public ewg g() {
      return this.b(1.0F);
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      ur $$4 = this.l();
      eum $$5 = this.a();
      int $$6 = this.k();
      int $$7 = $$5.a($$4);
      int $$8 = this.p() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.r() + (this.i() - 9) / 2;
      asy $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private asy a(ur $$0, int $$1) {
      eum $$2 = this.a();
      uw $$3 = $$2.a($$0, $$1 - $$2.a(uq.t));
      return ru.a().a(uw.a($$3, uq.t));
   }
}
