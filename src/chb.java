import javax.annotation.Nullable;

public abstract class chb extends cha implements che {
   private iq<cmy> c = iq.a(36, cmy.f);
   @Nullable
   private ahg d;
   private long e;

   protected chb(blz<?> $$0, ctp $$1) {
      super($$0, $$1);
   }

   protected chb(blz<?> $$0, double $$1, double $$2, double $$3, ctp $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bkt $$0) {
      super.a($$0);
      this.a($$0, this.dM(), this);
   }

   @Override
   public cmy a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cmy a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cmy b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cmy $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bnd a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfi $$0) {
      return this.g($$0);
   }

   @Override
   public void a(blv.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bjx.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sn $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bkb a(cfi $$0, bka $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cib.b(this);
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

   public void a(ahg $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cib createMenu(int $$0, cfh $$1, cfi $$2) {
      if (this.d != null && $$2.P_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract cib a(int var1, cfh var2);

   @Nullable
   @Override
   public ahg C() {
      return this.d;
   }

   @Override
   public void a(@Nullable ahg $$0) {
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
   public iq<cmy> E() {
      return this.c;
   }

   @Override
   public void G() {
      this.c = iq.a(this.b(), cmy.f);
   }
}
