public class eqk extends epe {
   private float a = 0.5F;

   public eqk(sw $$0, eov $$1) {
      this(0, 0, $$1.a($$0.f()), 9, $$0, $$1);
   }

   public eqk(int $$0, int $$1, sw $$2, eov $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public eqk(int $$0, int $$1, int $$2, int $$3, sw $$4, eov $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.r = false;
   }

   public eqk h(int $$0) {
      super.a($$0);
      return this;
   }

   private eqk b(float $$0) {
      this.a = $$0;
      return this;
   }

   public eqk e() {
      return this.b(0.0F);
   }

   public eqk f() {
      return this.b(0.5F);
   }

   public eqk g() {
      return this.b(1.0F);
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      sw $$4 = this.l();
      eov $$5 = this.a();
      int $$6 = this.p() + Math.round(this.a * (float)(this.k() - $$5.a($$4)));
      int $$7 = this.r() + (this.h() - 9) / 2;
      $$0.b($$5, $$4, $$6, $$7, this.b());
   }
}
