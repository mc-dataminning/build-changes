public abstract class fpo<T extends cqv> extends fom<T> implements cqf {
   private final akq D;

   public fpo(T $$0, cmu $$1, wy $$2, akq $$3) {
      super($$0, $$1, $$2);
      this.D = $$3;
   }

   protected void F() {
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.F();
      this.w.a(this);
   }

   @Override
   public void j() {
      super.j();
      this.w.b(this);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   protected void d(fht $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(fht $$0, float $$1, int $$2, int $$3) {
      $$0.a(this.D, this.z, this.A, 0, 0, this.c, this.q);
      this.c($$0, this.z, this.A);
   }

   protected abstract void c(fht var1, int var2, int var3);

   @Override
   public void a(cps $$0, int $$1, int $$2) {
   }

   @Override
   public void a(cps $$0, int $$1, cuo $$2) {
   }
}
