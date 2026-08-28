import javax.annotation.Nullable;

public abstract class cro extends crn implements crs {
   private jz<cxg> b = jz.a(36, cxg.j);
   @Nullable
   private alo<ewn> c;
   private long d;

   protected cro(bvi<?> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(arx $$0, btr $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public cxg a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cxg a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cxg b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cxg $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bwp a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpo $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bvb.d $$0) {
      if (!this.dW().C && $$0.a()) {
         bsw.a(this.dW(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(um $$0) {
      super.b($$0);
      this.a($$0, this.dY());
   }

   @Override
   protected void a(um $$0) {
      super.a($$0);
      this.b($$0, this.dY());
   }

   @Override
   public bta a(cpo $$0, bsz $$1) {
      return this.b_($$0);
   }

   @Override
   protected fbr a(fbr $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - cst.b(this);
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

   public void a(alo<ewn> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public cst createMenu(int $$0, cpn $$1, cpo $$2) {
      if (this.c != null && $$2.aa_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract cst a(int var1, cpn var2);

   @Nullable
   @Override
   public alo<ewn> v() {
      return this.c;
   }

   @Override
   public void a(@Nullable alo<ewn> $$0) {
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
   public jz<cxg> B() {
      return this.b;
   }

   @Override
   public void C() {
      this.b = jz.a(this.b(), cxg.j);
   }
}
