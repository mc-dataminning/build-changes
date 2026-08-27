public abstract class fln<T extends cnr> extends fkm<T> implements cnb {
   private final ajt A;

   public fln(T $$0, cjs $$1, wg $$2, ajt $$3) {
      super($$0, $$1, $$2);
      this.A = $$3;
   }

   protected void E() {
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.E();
      this.s.a(this);
   }

   @Override
   public void j() {
      super.j();
      this.s.b(this);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   protected void d(fdc $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      $$0.a(this.A, this.w, this.x, 0, 0, this.c, this.d);
      this.c($$0, this.w, this.x);
   }

   protected abstract void c(fdc var1, int var2, int var3);

   @Override
   public void a(cmp $$0, int $$1, int $$2) {
   }

   @Override
   public void a(cmp $$0, int $$1, crj $$2) {
   }
}
