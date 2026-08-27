import javax.annotation.Nullable;

public abstract class chj extends chi implements chm {
   private iq<cng> c = iq.a(36, cng.f);
   @Nullable
   private ahh d;
   private long e;

   protected chj(bmc<?> $$0, ctx $$1) {
      super($$0, $$1);
   }

   protected chj(bmc<?> $$0, double $$1, double $$2, double $$3, ctx $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bkv $$0) {
      super.a($$0);
      this.a($$0, this.dL(), this);
   }

   @Override
   public cng a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cng a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cng b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cng $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bng a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfq $$0) {
      return this.g($$0);
   }

   @Override
   public void a(blw.c $$0) {
      if (!this.dL().B && $$0.a()) {
         bjy.a(this.dL(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(so $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bkc a(cfq $$0, bkb $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cij.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.aZ()) {
         $$0 *= 0.95F;
      }

      this.g(this.do().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(ahh $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cij createMenu(int $$0, cfp $$1, cfq $$2) {
      if (this.d != null && $$2.P_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract cij a(int var1, cfp var2);

   @Nullable
   @Override
   public ahh C() {
      return this.d;
   }

   @Override
   public void a(@Nullable ahh $$0) {
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
   public iq<cng> E() {
      return this.c;
   }

   @Override
   public void G() {
      this.c = iq.a(this.b(), cng.f);
   }
}
