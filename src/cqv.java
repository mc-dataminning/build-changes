import javax.annotation.Nullable;

public abstract class cqv extends cqu implements cqz {
   private ka<cwn> b = ka.a(36, cwn.j);
   @Nullable
   private akt<evu> c;
   private long d;

   protected cqv(buq<?> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(arc $$0, bsz $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public cwn a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cwn a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwn b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cwn $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvx a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cov $$0) {
      return this.g($$0);
   }

   @Override
   public void a(buj.d $$0) {
      if (!this.dW().C && $$0.a()) {
         bse.a(this.dW(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(tq $$0) {
      super.b($$0);
      this.a($$0, this.dY());
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.b($$0, this.dY());
   }

   @Override
   public bsi a(cov $$0, bsh $$1) {
      return this.b_($$0);
   }

   @Override
   protected fay a(fay $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - csa.b(this);
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

   public void a(akt<evu> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public csa createMenu(int $$0, cou $$1, cov $$2) {
      if (this.c != null && $$2.Z_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract csa a(int var1, cou var2);

   @Nullable
   @Override
   public akt<evu> v() {
      return this.c;
   }

   @Override
   public void a(@Nullable akt<evu> $$0) {
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
   public ka<cwn> B() {
      return this.b;
   }

   @Override
   public void C() {
      this.b = ka.a(this.b(), cwn.j);
   }
}
