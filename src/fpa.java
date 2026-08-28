public abstract class fpa<T extends cqk> extends fny<T> implements cpu {
   private final akk D;

   public fpa(T $$0, cmj $$1, wu $$2, akk $$3) {
      super($$0, $$1, $$2);
      this.D = $$3;
   }

   protected void G() {
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.G();
      this.w.a(this);
   }

   @Override
   public void j() {
      super.j();
      this.w.b(this);
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   protected void d(fhf $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(fhf $$0, float $$1, int $$2, int $$3) {
      $$0.a(this.D, this.z, this.A, 0, 0, this.c, this.q);
      this.c($$0, this.z, this.A);
   }

   protected abstract void c(fhf var1, int var2, int var3);

   @Override
   public void a(cph $$0, int $$1, int $$2) {
   }

   @Override
   public void a(cph $$0, int $$1, cuc $$2) {
   }
}
