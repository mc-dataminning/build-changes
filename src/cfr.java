import javax.annotation.Nullable;

public abstract class cfr extends cfq implements cfu {
   private ip<clo> c = ip.a(36, clo.b);
   @Nullable
   private agm d;
   private long e;

   protected cfr(bkz<?> $$0, csf $$1) {
      super($$0, $$1);
   }

   protected cfr(bkz<?> $$0, double $$1, double $$2, double $$3, csf $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bjt $$0) {
      super.a($$0);
      this.a($$0, this.dN(), this);
   }

   @Override
   public clo a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public clo a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public clo b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, clo $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bmd a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cdz $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bkv.c $$0) {
      if (!this.dN().B && $$0.a()) {
         bix.a(this.dN(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sd $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bjb a(cdz $$0, bja $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cgr.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.aZ()) {
         $$0 *= 0.95F;
      }

      this.g(this.dq().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(agm $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cgr createMenu(int $$0, cdy $$1, cdz $$2) {
      if (this.d != null && $$2.P_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract cgr a(int var1, cdy var2);

   @Nullable
   @Override
   public agm C() {
      return this.d;
   }

   @Override
   public void a(@Nullable agm $$0) {
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
   public ip<clo> E() {
      return this.c;
   }

   @Override
   public void G() {
      this.c = ip.a(this.b(), clo.b);
   }
}
