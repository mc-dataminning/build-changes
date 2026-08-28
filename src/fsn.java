public abstract class fsn<T extends cto> extends fsl<T> implements fvz {
   private final fvt<?> G;
   private boolean H;

   public fsn(T $$0, fvt<?> $$1, cot $$2, xj $$3) {
      super($$0, $$2, $$3);
      this.G = $$1;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.H = this.n < 379;
      this.G.a(this.n, this.o, this.m, this.H);
      this.C = this.G.a(this.n, this.s);
      this.O();
   }

   protected abstract fqk J();

   private void O() {
      fqk $$0 = this.J();
      this.c(new fmp($$0.a(), $$0.b(), 20, 18, fvt.a, $$0x -> {
         this.G.c();
         this.C = this.G.a(this.n, this.s);
         fqk $$1 = this.J();
         $$0x.c($$1.a(), $$1.b());
         this.K();
      }));
      this.d(this.G);
   }

   protected void K() {
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      if (this.G.d() && this.H) {
         this.b($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }

      this.G.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
      this.G.a($$0, $$1, $$2, this.B);
   }

   @Override
   protected void c(flq $$0) {
      super.c($$0);
      this.G.a($$0, this.L());
   }

   protected boolean L() {
      return true;
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.G.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.G.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.G.a($$0, $$1, $$2)) {
         this.a(this.G);
         return true;
      } else {
         return this.H && this.G.d() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.H || !this.G.d()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.s) || $$1 >= (double)($$3 + this.u);
      return this.G.a($$0, $$1, this.C, this.D, this.s, this.u, $$4) && $$5;
   }

   @Override
   protected void a(ctw $$0, int $$1, int $$2, csk $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.G.b($$0);
   }

   @Override
   public void F() {
      super.F();
      this.G.e();
   }

   @Override
   public void M() {
      this.G.f();
   }

   @Override
   public fvt N() {
      return this.G;
   }
}
