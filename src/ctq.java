import javax.annotation.Nullable;

public abstract class ctq extends ctp implements ctu {
   private jn<czd> b = jn.a(36, czd.k);
   @Nullable
   private alf<ezm> c;
   private long d;

   protected ctq(bwo<?> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(arq $$0, buu $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public czd a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public czd a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public czd b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, czd $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bxv a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crc $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bwf.e $$0) {
      if (!this.dV().C && $$0.a()) {
         btz.a(this.dV(), this, this);
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
   public bud a(crc $$0, buc $$1) {
      return this.b_($$0);
   }

   @Override
   protected feq a(feq $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - cuv.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bj()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.ag_();
   }

   public void a(alf<ezm> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public cuv createMenu(int $$0, crb $$1, crc $$2) {
      if (this.c != null && $$2.V_()) {
         return null;
      } else {
         this.f($$1.h);
         return this.a($$0, $$1);
      }
   }

   protected abstract cuv a(int var1, crb var2);

   @Nullable
   @Override
   public alf<ezm> q() {
      return this.c;
   }

   @Override
   public void a(@Nullable alf<ezm> $$0) {
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
   public jn<czd> t() {
      return this.b;
   }

   @Override
   public void u() {
      this.b = jn.a(this.b(), czd.k);
   }
}
