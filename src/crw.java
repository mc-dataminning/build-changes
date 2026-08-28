import javax.annotation.Nullable;

public abstract class crw extends crv implements csa {
   private jz<cxo> b = jz.a(36, cxo.k);
   @Nullable
   private aly<ewt> c;
   private long d;

   protected crw(bvq<?> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(ash $$0, btz $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public cxo a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cxo a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cxo b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cxo $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bwx a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpw $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bvj.c $$0) {
      if (!this.dV().C && $$0.a()) {
         bte.a(this.dV(), this, this);
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
   public bti a(cpw $$0, bth $$1) {
      return this.b_($$0);
   }

   @Override
   protected fbx a(fbx $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - ctb.b(this);
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

   public void a(aly<ewt> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public ctb createMenu(int $$0, cpv $$1, cpw $$2) {
      if (this.c != null && $$2.aa_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract ctb a(int var1, cpv var2);

   @Nullable
   @Override
   public aly<ewt> v() {
      return this.c;
   }

   @Override
   public void a(@Nullable aly<ewt> $$0) {
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
   public jz<cxo> B() {
      return this.b;
   }

   @Override
   public void C() {
      this.b = jz.a(this.b(), cxo.k);
   }
}
