import javax.annotation.Nullable;

public abstract class clp extends clo implements cls {
   private iu<crj> c = iu.a(36, crj.i);
   @Nullable
   private ajt d;
   private long e;

   protected clp(bqb<?> $$0, cyx $$1) {
      super($$0, $$1);
   }

   protected clp(bqb<?> $$0, double $$1, double $$2, double $$3, cyx $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bot $$0) {
      super.a($$0);
      this.a($$0, this.dM(), this);
   }

   @Override
   public crj a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public crj a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public crj b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, crj $$1) {
      this.c($$0, $$1);
   }

   @Override
   public brf a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cjt $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bpv.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bnw.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(tm $$0) {
      super.b($$0);
      this.a($$0, this.dO());
   }

   @Override
   protected void a(tm $$0) {
      super.a($$0);
      this.b($$0, this.dO());
   }

   @Override
   public boa a(cjt $$0, bnz $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cmp.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.bc()) {
         $$0 *= 0.95F;
      }

      this.g(this.dp().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(ajt $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cmp createMenu(int $$0, cjs $$1, cjt $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract cmp a(int var1, cjs var2);

   @Nullable
   @Override
   public ajt B() {
      return this.d;
   }

   @Override
   public void a(@Nullable ajt $$0) {
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
   public iu<crj> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = iu.a(this.b(), crj.i);
   }
}
