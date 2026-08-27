public abstract class ffa<T extends cjc> extends fdz<T> implements cim {
   private final ahg x;

   public ffa(T $$0, cfg $$1, vf $$2, ahg $$3) {
      super($$0, $$1, $$2);
      this.x = $$3;
   }

   protected void H() {
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.H();
      this.p.a(this);
   }

   @Override
   public void j() {
      super.j();
      this.p.b(this);
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   protected void d(ewt $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(ewt $$0, float $$1, int $$2, int $$3) {
      $$0.a(this.x, this.t, this.u, 0, 0, this.c, this.k);
      this.c($$0, this.t, this.u);
   }

   protected abstract void c(ewt var1, int var2, int var3);

   @Override
   public void a(cia $$0, int $$1, int $$2) {
   }

   @Override
   public void a(cia $$0, int $$1, cmx $$2) {
   }
}
