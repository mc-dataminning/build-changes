import javax.annotation.Nullable;

public abstract class cjf extends cje implements cji {
   private is<cpd> c = is.a(36, cpd.h);
   @Nullable
   private aiy d;
   private long e;

   protected cjf(bnw<?> $$0, cvr $$1) {
      super($$0, $$1);
   }

   protected cjf(bnw<?> $$0, double $$1, double $$2, double $$3, cvr $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bmp $$0) {
      super.a($$0);
      this.a($$0, this.dM(), this);
   }

   @Override
   public cpd a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cpd a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cpd b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cpd $$1) {
      this.c($$0, $$1);
   }

   @Override
   public boz a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(chl $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bnq.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bls.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sw $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public blw a(chl $$0, blv $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - ckf.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.aZ()) {
         $$0 *= 0.95F;
      }

      this.g(this.dp().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(aiy $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public ckf createMenu(int $$0, chk $$1, chl $$2) {
      if (this.d != null && $$2.P_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract ckf a(int var1, chk var2);

   @Nullable
   @Override
   public aiy C() {
      return this.d;
   }

   @Override
   public void a(@Nullable aiy $$0) {
      this.d = $$0;
   }

   @Override
   public long D() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public is<cpd> E() {
      return this.c;
   }

   @Override
   public void G() {
      this.c = is.a(this.b(), cpd.h);
   }
}
