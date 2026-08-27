public abstract class ezt<T extends cfc> extends eyt<T> implements ceo {
   private final aep x;

   public ezt(T $$0, cbk $$1, te $$2, aep $$3) {
      super($$0, $$1, $$2);
      this.x = $$3;
   }

   protected void D() {
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.D();
      this.p.a(this);
   }

   @Override
   public void h() {
      super.h();
      this.p.b(this);
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   protected void d(erx $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(erx $$0, float $$1, int $$2, int $$3) {
      $$0.a(this.x, this.t, this.u, 0, 0, this.c, this.k);
      this.c($$0, this.t, this.u);
   }

   protected abstract void c(erx var1, int var2, int var3);

   @Override
   public void a(cec $$0, int $$1, int $$2) {
   }

   @Override
   public void a(cec $$0, int $$1, ciw $$2) {
   }
}
