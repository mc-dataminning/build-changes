public abstract class fms<T extends coj> extends flr<T> implements cnt {
   private final akf D;

   public fms(T $$0, ckk $$1, ws $$2, akf $$3) {
      super($$0, $$1, $$2);
      this.D = $$3;
   }

   protected void E() {
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.E();
      this.w.a(this);
   }

   @Override
   public void j() {
      super.j();
      this.w.b(this);
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   protected void d(feh $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(feh $$0, float $$1, int $$2, int $$3) {
      $$0.a(this.D, this.z, this.A, 0, 0, this.c, this.d);
      this.c($$0, this.z, this.A);
   }

   protected abstract void c(feh var1, int var2, int var3);

   @Override
   public void a(cnh $$0, int $$1, int $$2) {
   }

   @Override
   public void a(cnh $$0, int $$1, csd $$2) {
   }
}
