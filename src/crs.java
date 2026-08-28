import javax.annotation.Nullable;

public abstract class crs extends crr implements crw {
   private jz<cxk> b = jz.a(36, cxk.k);
   @Nullable
   private aly<ewm> c;
   private long d;

   protected crs(bvm<?> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(ash $$0, btv $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public cxk a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cxk a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cxk b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cxk $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bwt a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cps $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bvf.c $$0) {
      if (!this.dV().C && $$0.a()) {
         bta.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ux $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(ux $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public bte a(cps $$0, btd $$1) {
      return this.b_($$0);
   }

   @Override
   protected fbs a(fbs $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - csx.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bj()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(aly<ewm> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public csx createMenu(int $$0, cpr $$1, cps $$2) {
      if (this.c != null && $$2.aa_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract csx a(int var1, cpr var2);

   @Nullable
   @Override
   public aly<ewm> v() {
      return this.c;
   }

   @Override
   public void a(@Nullable aly<ewm> $$0) {
      this.c = $$0;
   }

   @Override
   public long x() {
      return this.d;
   }

   @Override
   public void a(long $$0) {
      this.d = $$0;
   }

   @Override
   public jz<cxk> B() {
      return this.b;
   }

   @Override
   public void C() {
      this.b = jz.a(this.b(), cxk.k);
   }
}
