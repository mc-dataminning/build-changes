import javax.annotation.Nullable;

public abstract class cos extends cor implements cov {
   private jv<cuo> c = jv.a(36, cuo.l);
   @Nullable
   private akp<erq> d;
   private long e;

   protected cos(bsw<?> $$0, dcu $$1) {
      super($$0, $$1);
   }

   protected cos(bsw<?> $$0, double $$1, double $$2, double $$3, dcu $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(brj $$0) {
      super.a($$0);
      this.a($$0, this.dQ(), this);
   }

   @Override
   public cuo a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cuo a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cuo b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cuo $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bue a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmv $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bsq.c $$0) {
      if (!this.dQ().B && $$0.a()) {
         bqm.a(this.dQ(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      this.a($$0, this.dS());
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.b($$0, this.dS());
   }

   @Override
   public bqq a(cmv $$0, bqp $$1) {
      return this.c_($$0);
   }

   @Override
   protected void t() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cps.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.bf()) {
         $$0 *= 0.95F;
      }

      this.i(this.dt().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(akp<erq> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cps createMenu(int $$0, cmu $$1, cmv $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cps a(int var1, cmu var2);

   @Nullable
   @Override
   public akp<erq> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable akp<erq> $$0) {
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
   public jv<cuo> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = jv.a(this.b(), cuo.l);
   }
}
