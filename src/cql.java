import javax.annotation.Nullable;

public abstract class cql extends cqk implements cqo {
   private jz<cwb> c = jz.a(36, cwb.k);
   @Nullable
   private alh<euh> d;
   private long e;

   protected cql(bul<?> $$0, dfb $$1) {
      super($$0, $$1);
   }

   protected cql(bul<?> $$0, double $$1, double $$2, double $$3, dfb $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bsu $$0) {
      super.a($$0);
      this.a($$0, this.dX(), this);
   }

   @Override
   public cwb a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cwb a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwb b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cwb $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvs a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(com $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bue.c $$0) {
      if (!this.dX().C && $$0.a()) {
         brz.a(this.dX(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(uk $$0) {
      super.b($$0);
      this.a($$0, this.dZ());
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      this.b($$0, this.dZ());
   }

   @Override
   public bsd a(com $$0, bsc $$1) {
      return this.c_($$0);
   }

   @Override
   protected ezn a(ezn $$0) {
      float $$1 = 0.98F;
      if (this.d == null) {
         int $$2 = 15 - cro.b(this);
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

   public void a(alh<euh> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cro createMenu(int $$0, col $$1, com $$2) {
      if (this.d != null && $$2.R_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract cro a(int var1, col var2);

   @Nullable
   @Override
   public alh<euh> E() {
      return this.d;
   }

   @Override
   public void a(@Nullable alh<euh> $$0) {
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
   public jz<cwb> G() {
      return this.c;
   }

   @Override
   public void I() {
      this.c = jz.a(this.b(), cwb.k);
   }
}
