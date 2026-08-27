import javax.annotation.Nullable;

public abstract class cdm extends cdl implements cdp {
   private hp<cjf> c = hp.a(36, cjf.b);
   @Nullable
   private aex d;
   private long e;

   protected cdm(biu<?> $$0, cpv $$1) {
      super($$0, $$1);
   }

   protected cdm(biu<?> $$0, double $$1, double $$2, double $$3, cpv $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bho $$0) {
      super.a($$0);
      this.a($$0, this.dL(), this);
   }

   @Override
   public cjf a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cjf a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cjf b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cjf $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bjy a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbu $$0) {
      return this.g($$0);
   }

   @Override
   public void a(biq.c $$0) {
      if (!this.dL().B && $$0.a()) {
         bgu.a(this.dL(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qy $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bgy a(cbu $$0, bgx $$1) {
      return this.c_($$0);
   }

   @Override
   protected void v() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cel.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.aX()) {
         $$0 *= 0.95F;
      }

      this.f(this.do().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(aex $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cel createMenu(int $$0, cbt $$1, cbu $$2) {
      if (this.d != null && $$2.M_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract cel a(int var1, cbt var2);

   @Nullable
   @Override
   public aex G() {
      return this.d;
   }

   @Override
   public void a(@Nullable aex $$0) {
      this.d = $$0;
   }

   @Override
   public long H() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public hp<cjf> I() {
      return this.c;
   }

   @Override
   public void K() {
      this.c = hp.a(this.b(), cjf.b);
   }
}
