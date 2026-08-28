import javax.annotation.Nullable;

public abstract class ctf extends cte implements ctj {
   private jn<cys> b = jn.a(36, cys.k);
   @Nullable
   private ald<eys> c;
   private long d;

   protected ctf(bwj<?> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(aro $$0, bup $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public cys a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cys a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cys b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cys $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bxq a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cqs $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bwa.e $$0) {
      if (!this.dV().C && $$0.a()) {
         btu.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public bty a(cqs $$0, btx $$1) {
      return this.b_($$0);
   }

   @Override
   protected fdw a(fdw $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - cuk.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bj()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.af_();
   }

   public void a(ald<eys> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public cuk createMenu(int $$0, cqr $$1, cqs $$2) {
      if (this.c != null && $$2.U_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract cuk a(int var1, cqr var2);

   @Nullable
   @Override
   public ald<eys> q() {
      return this.c;
   }

   @Override
   public void a(@Nullable ald<eys> $$0) {
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
   public jn<cys> t() {
      return this.b;
   }

   @Override
   public void u() {
      this.b = jn.a(this.b(), cys.k);
   }
}
