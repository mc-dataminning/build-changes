import javax.annotation.Nullable;

public abstract class cop extends coo implements cos {
   private jr<cuk> c = jr.a(36, cuk.l);
   @Nullable
   private ala<eqi> d;
   private long e;

   protected cop(bsv<?> $$0, dbt $$1) {
      super($$0, $$1);
   }

   protected cop(bsv<?> $$0, double $$1, double $$2, double $$3, dbt $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bri $$0) {
      super.a($$0);
      this.a($$0, this.dP(), this);
   }

   @Override
   public cuk a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cuk a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cuk b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cuk $$1) {
      this.c($$0, $$1);
   }

   @Override
   public buc a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cms $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bsp.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bql.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ur $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(ur $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public bqp a(cms $$0, bqo $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cpp.b(this);
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

   public void a(ala<eqi> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cpp createMenu(int $$0, cmr $$1, cms $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cpp a(int var1, cmr var2);

   @Nullable
   @Override
   public ala<eqi> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable ala<eqi> $$0) {
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
   public jr<cuk> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = jr.a(this.b(), cuk.l);
   }
}
