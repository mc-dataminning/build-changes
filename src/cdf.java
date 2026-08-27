import javax.annotation.Nullable;

public abstract class cdf extends cde implements cdi {
   private hn<ciy> c = hn.a(36, ciy.b);
   @Nullable
   private aer d;
   private long e;

   protected cdf(bim<?> $$0, cpm $$1) {
      super($$0, $$1);
   }

   protected cdf(bim<?> $$0, double $$1, double $$2, double $$3, cpm $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bhg $$0) {
      super.a($$0);
      this.a($$0, this.dK(), this);
   }

   @Override
   public ciy a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public ciy a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public ciy b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, ciy $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bjr a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbn $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bii.c $$0) {
      if (!this.dK().B && $$0.a()) {
         bgm.a(this.dK(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qr $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bgq a(cbn $$0, bgp $$1) {
      return this.c_($$0);
   }

   @Override
   protected void p() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cee.b(this);
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

   public void a(aer $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cee createMenu(int $$0, cbm $$1, cbn $$2) {
      if (this.d != null && $$2.G_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract cee a(int var1, cbm var2);

   @Nullable
   @Override
   public aer A() {
      return this.d;
   }

   @Override
   public void a(@Nullable aer $$0) {
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
   public hn<ciy> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = hn.a(this.b(), ciy.b);
   }
}
