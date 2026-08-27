import javax.annotation.Nullable;

public abstract class cnx extends cnw implements coa {
   private jj<cuh> c = jj.a(36, cuh.i);
   @Nullable
   private aks<eru> d;
   private long e;

   protected cnx(bsb<?> $$0, dca $$1) {
      super($$0, $$1);
   }

   protected cnx(bsb<?> $$0, double $$1, double $$2, double $$3, dca $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bqt $$0) {
      super.a($$0);
      this.a($$0, this.dU(), this);
   }

   @Override
   public cuh a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cuh a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cuh b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cuh $$1) {
      this.c($$0, $$1);
   }

   @Override
   public btf a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cly $$0) {
      return this.g($$0);
   }

   @Override
   public void a(brv.d $$0) {
      if (!this.dU().C && $$0.a()) {
         bpw.a(this.dU(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(uk $$0) {
      super.b($$0);
      this.a($$0, this.dY());
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      this.b($$0, this.dY());
   }

   @Override
   public bqa a(cly $$0, bpz $$1) {
      return this.c_($$0);
   }

   @Override
   protected void t() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cpg.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.bi()) {
         $$0 *= 0.95F;
      }

      this.g(this.dx().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(aks<eru> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cpg createMenu(int $$0, clx $$1, cly $$2) {
      if (this.d != null && $$2.O_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cpg a(int var1, clx var2);

   @Nullable
   @Override
   public aks<eru> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable aks<eru> $$0) {
      this.d = $$0;
   }

   @Override
   public long C() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public jj<cuh> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = jj.a(this.b(), cuh.i);
   }
}
