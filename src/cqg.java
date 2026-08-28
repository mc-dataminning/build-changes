import javax.annotation.Nullable;

public abstract class cqg extends cqf implements cqj {
   private jy<cvx> c = jy.a(36, cvx.k);
   @Nullable
   private alg<eub> d;
   private long e;

   protected cqg(bug<?> $$0, dev $$1) {
      super($$0, $$1);
   }

   protected cqg(bug<?> $$0, double $$1, double $$2, double $$3, dev $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bsp $$0) {
      super.a($$0);
      this.a($$0, this.dX(), this);
   }

   @Override
   public cvx a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cvx a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cvx b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cvx $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvn a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(coh $$0) {
      return this.g($$0);
   }

   @Override
   public void a(btz.c $$0) {
      if (!this.dX().C && $$0.a()) {
         bru.a(this.dX(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(uj $$0) {
      super.b($$0);
      this.a($$0, this.dZ());
   }

   @Override
   protected void a(uj $$0) {
      super.a($$0);
      this.b($$0, this.dZ());
   }

   @Override
   public bry a(coh $$0, brx $$1) {
      return this.c_($$0);
   }

   @Override
   protected ezh a(ezh $$0) {
      float $$1 = 0.98F;
      if (this.d == null) {
         int $$2 = 15 - crj.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bk()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(alg<eub> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public crj createMenu(int $$0, cog $$1, coh $$2) {
      if (this.d != null && $$2.R_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract crj a(int var1, cog var2);

   @Nullable
   @Override
   public alg<eub> E() {
      return this.d;
   }

   @Override
   public void a(@Nullable alg<eub> $$0) {
      this.d = $$0;
   }

   @Override
   public long F() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public jy<cvx> G() {
      return this.c;
   }

   @Override
   public void I() {
      this.c = jy.a(this.b(), cvx.k);
   }
}
