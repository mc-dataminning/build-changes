public abstract class fhl<T extends clh> extends fgk<T> implements ckr {
   private final aiy x;

   public fhl(T $$0, chk $$1, vq $$2, aiy $$3) {
      super($$0, $$1, $$2);
      this.x = $$3;
   }

   protected void I() {
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.I();
      this.p.a(this);
   }

   @Override
   public void k() {
      super.k();
      this.p.b(this);
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   protected void d(ezb $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(ezb $$0, float $$1, int $$2, int $$3) {
      $$0.a(this.x, this.t, this.u, 0, 0, this.c, this.k);
      this.c($$0, this.t, this.u);
   }

   protected abstract void c(ezb var1, int var2, int var3);

   @Override
   public void a(ckf $$0, int $$1, int $$2) {
   }

   @Override
   public void a(ckf $$0, int $$1, cpd $$2) {
   }
}
