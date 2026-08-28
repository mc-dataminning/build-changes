import javax.annotation.Nullable;

public abstract class ctl extends ctk implements ctp {
   private jn<cyy> b = jn.a(36, cyy.k);
   @Nullable
   private alf<eze> c;
   private long d;

   protected ctl(bwm<?> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(arq $$0, bus $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public cyy a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cyy a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cyy b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cyy $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bxt a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cqy $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bwd.e $$0) {
      if (!this.dV().C && $$0.a()) {
         btx.a(this.dV(), this, this);
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
   public bub a(cqy $$0, bua $$1) {
      return this.b_($$0);
   }

   @Override
   protected fei a(fei $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - cuq.b(this);
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

   public void a(alf<eze> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public cuq createMenu(int $$0, cqx $$1, cqy $$2) {
      if (this.c != null && $$2.U_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract cuq a(int var1, cqx var2);

   @Nullable
   @Override
   public alf<eze> q() {
      return this.c;
   }

   @Override
   public void a(@Nullable alf<eze> $$0) {
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
   public jn<cyy> t() {
      return this.b;
   }

   @Override
   public void u() {
      this.b = jn.a(this.b(), cyy.k);
   }
}
