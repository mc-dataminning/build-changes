import javax.annotation.Nullable;

public abstract class cpt extends cps implements cpw {
   private jw<cvp> c = jw.a(36, cvp.k);
   @Nullable
   private alb<etm> d;
   private long e;

   protected cpt(btv<?> $$0, deg $$1) {
      super($$0, $$1);
   }

   protected cpt(btv<?> $$0, double $$1, double $$2, double $$3, deg $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bsg $$0) {
      super.a($$0);
      this.a($$0, this.dS(), this);
   }

   @Override
   public cvp a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cvp a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cvp b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cvp $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvb a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cnu $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bto.c $$0) {
      if (!this.dS().B && $$0.a()) {
         brl.a(this.dS(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(uf $$0) {
      super.b($$0);
      this.a($$0, this.dU());
   }

   @Override
   protected void a(uf $$0) {
      super.a($$0);
      this.b($$0, this.dU());
   }

   @Override
   public brp a(cnu $$0, bro $$1) {
      return this.c_($$0);
   }

   @Override
   protected eys a(eys $$0) {
      float $$1 = 0.98F;
      if (this.d == null) {
         int $$2 = 15 - cqw.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bi()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(alb<etm> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cqw createMenu(int $$0, cnt $$1, cnu $$2) {
      if (this.d != null && $$2.P_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract cqw a(int var1, cnt var2);

   @Nullable
   @Override
   public alb<etm> F() {
      return this.d;
   }

   @Override
   public void a(@Nullable alb<etm> $$0) {
      this.d = $$0;
   }

   @Override
   public long G() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public jw<cvp> I() {
      return this.c;
   }

   @Override
   public void J() {
      this.c = jw.a(this.b(), cvp.k);
   }
}
