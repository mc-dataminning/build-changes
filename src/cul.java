import javax.annotation.Nullable;

public abstract class cul extends cuk implements cup {
   private jo<czy> b = jo.a(36, czy.k);
   @Nullable
   private alh<fam> c;
   private long d;

   protected cul(bxc<?> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(ars $$0, bvi $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public czy a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public czy a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public czy b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, czy $$1) {
      this.c($$0, $$1);
   }

   @Override
   public byl a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crx $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bwt.d $$0) {
      if (!this.dV().C && $$0.a()) {
         bun.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public bur a(crx $$0, buq $$1) {
      return this.b_($$0);
   }

   @Override
   protected ffq a(ffq $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - cvq.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bi()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.ak_();
   }

   public void a(alh<fam> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public cvq createMenu(int $$0, crw $$1, crx $$2) {
      if (this.c != null && $$2.Z_()) {
         return null;
      } else {
         this.f($$1.h);
         return this.a($$0, $$1);
      }
   }

   protected abstract cvq a(int var1, crw var2);

   @Nullable
   @Override
   public alh<fam> q() {
      return this.c;
   }

   @Override
   public void a(@Nullable alh<fam> $$0) {
      this.c = $$0;
   }

   @Override
   public long s() {
      return this.d;
   }

   @Override
   public void a(long $$0) {
      this.d = $$0;
   }

   @Override
   public jo<czy> t() {
      return this.b;
   }

   @Override
   public void u() {
      this.b = jo.a(this.b(), czy.k);
   }
}
