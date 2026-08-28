import javax.annotation.Nullable;

public abstract class cov extends cou implements coy {
   private jr<cuq> c = jr.a(36, cuq.l);
   @Nullable
   private ale<eqo> d;
   private long e;

   protected cov(btb<?> $$0, dbz $$1) {
      super($$0, $$1);
   }

   protected cov(btb<?> $$0, double $$1, double $$2, double $$3, dbz $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bro $$0) {
      super.a($$0);
      this.a($$0, this.dP(), this);
   }

   @Override
   public cuq a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cuq a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cuq b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cuq $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bui a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmy $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bsv.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bqr.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(us $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(us $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public bqv a(cmy $$0, bqu $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cpv.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.be()) {
         $$0 *= 0.95F;
      }

      this.h(this.ds().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(ale<eqo> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cpv createMenu(int $$0, cmx $$1, cmy $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cpv a(int var1, cmx var2);

   @Nullable
   @Override
   public ale<eqo> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable ale<eqo> $$0) {
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
   public jr<cuq> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = jr.a(this.b(), cuq.l);
   }
}
