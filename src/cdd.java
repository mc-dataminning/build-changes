import javax.annotation.Nullable;

public abstract class cdd extends cdc implements cdg {
   private ho<ciw> c = ho.a(36, ciw.b);
   @Nullable
   private aep d;
   private long e;

   protected cdd(bik<?> $$0, cpk $$1) {
      super($$0, $$1);
   }

   protected cdd(bik<?> $$0, double $$1, double $$2, double $$3, cpk $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bhe $$0) {
      super.a($$0);
      this.a($$0, this.dK(), this);
   }

   @Override
   public ciw a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public ciw a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public ciw b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, ciw $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bjp a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbl $$0) {
      return this.g($$0);
   }

   @Override
   public void a(big.c $$0) {
      if (!this.dK().B && $$0.a()) {
         bgk.a(this.dK(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qs $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bgo a(cbl $$0, bgn $$1) {
      return this.c_($$0);
   }

   @Override
   protected void p() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cec.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.aX()) {
         $$0 *= 0.95F;
      }

      this.f(this.dn().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(aep $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cec createMenu(int $$0, cbk $$1, cbl $$2) {
      if (this.d != null && $$2.G_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract cec a(int var1, cbk var2);

   @Nullable
   @Override
   public aep A() {
      return this.d;
   }

   @Override
   public void a(@Nullable aep $$0) {
      this.d = $$0;
   }

   @Override
   public long B() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public ho<ciw> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = ho.a(this.b(), ciw.b);
   }
}
