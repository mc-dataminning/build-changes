public abstract class ewp<T extends ccf> extends evp<T> implements cbr {
   private final acq w;

   public ewp(T $$0, byn $$1, sw $$2, acq $$3) {
      super($$0, $$1, $$2);
      this.w = $$3;
   }

   protected void D() {
   }

   @Override
   protected void b() {
      super.b();
      this.D();
      this.p.a(this);
   }

   @Override
   public void ax_() {
      super.ax_();
      this.p.b(this);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      super.a($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   protected void c(eox $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      $$0.a(this.w, this.s, this.t, 0, 0, this.c, this.k);
      this.c($$0, this.s, this.t);
   }

   protected abstract void c(eox var1, int var2, int var3);

   @Override
   public void a(cbf $$0, int $$1, int $$2) {
   }

   @Override
   public void a(cbf $$0, int $$1, cfz $$2) {
   }
}
