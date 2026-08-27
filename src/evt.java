public class evt extends euj {
   private float a = 0.5F;

   public evt(ur $$0, etz $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public evt(int $$0, int $$1, ur $$2, etz $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public evt(int $$0, int $$1, int $$2, int $$3, ur $$4, etz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.i = false;
   }

   public evt i(int $$0) {
      super.a($$0);
      return this;
   }

   private evt b(float $$0) {
      this.a = $$0;
      return this;
   }

   public evt e() {
      return this.b(0.0F);
   }

   public evt f() {
      return this.b(0.5F);
   }

   public evt g() {
      return this.b(1.0F);
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      ur $$4 = this.l();
      etz $$5 = this.a();
      int $$6 = this.k();
      int $$7 = $$5.a($$4);
      int $$8 = this.p() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.r() + (this.i() - 9) / 2;
      asu $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private asu a(ur $$0, int $$1) {
      etz $$2 = this.a();
      uw $$3 = $$2.a($$0, $$1 - $$2.a(uq.t));
      return ru.a().a(uw.a($$3, uq.t));
   }
}
