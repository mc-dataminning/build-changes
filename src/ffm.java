public abstract class ffm<T extends cjl> extends fel<T> implements civ {
   private final ahh x;

   public ffm(T $$0, cfp $$1, vg $$2, ahh $$3) {
      super($$0, $$1, $$2);
      this.x = $$3;
   }

   protected void I() {
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.I();
      this.p.a(this);
   }

   @Override
   public void k() {
      super.k();
      this.p.b(this);
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   protected void d(exe $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(exe $$0, float $$1, int $$2, int $$3) {
      $$0.a(this.x, this.t, this.u, 0, 0, this.c, this.k);
      this.c($$0, this.t, this.u);
   }

   protected abstract void c(exe var1, int var2, int var3);

   @Override
   public void a(cij $$0, int $$1, int $$2) {
   }

   @Override
   public void a(cij $$0, int $$1, cng $$2) {
   }
}
