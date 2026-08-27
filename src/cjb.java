import javax.annotation.Nullable;

public abstract class cjb extends cja implements cje {
   private is<coz> c = is.a(36, coz.h);
   @Nullable
   private aiy d;
   private long e;

   protected cjb(bnu<?> $$0, cvn $$1) {
      super($$0, $$1);
   }

   protected cjb(bnu<?> $$0, double $$1, double $$2, double $$3, cvn $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bmn $$0) {
      super.a($$0);
      this.a($$0, this.dM(), this);
   }

   @Override
   public coz a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public coz a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public coz b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, coz $$1) {
      this.c($$0, $$1);
   }

   @Override
   public box a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(chh $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bno.c $$0) {
      if (!this.dM().B && $$0.a()) {
         blq.a(this.dM(), this, this);
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
   public blu a(chh $$0, blt $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - ckb.b(this);
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
   public ckb createMenu(int $$0, chg $$1, chh $$2) {
      if (this.d != null && $$2.P_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract ckb a(int var1, chg var2);

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
   public is<coz> E() {
      return this.c;
   }

   @Override
   public void G() {
      this.c = is.a(this.b(), coz.h);
   }
}
