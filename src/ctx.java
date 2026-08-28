import javax.annotation.Nullable;

public abstract class ctx extends ctw implements cub {
   private jo<czk> b = jo.a(36, czk.k);
   @Nullable
   private alf<ezt> c;
   private long d;

   protected ctx(bwr<?> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(arq $$0, bux $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public czk a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public czk a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public czk b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, czk $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bya a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crj $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bwi.d $$0) {
      if (!this.dU().C && $$0.a()) {
         buc.a(this.dU(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      this.a($$0, this.dW());
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.b($$0, this.dW());
   }

   @Override
   public bug a(crj $$0, buf $$1) {
      return this.b_($$0);
   }

   @Override
   protected fex a(fex $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - cvc.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bh()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.ag_();
   }

   public void a(alf<ezt> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public cvc createMenu(int $$0, cri $$1, crj $$2) {
      if (this.c != null && $$2.V_()) {
         return null;
      } else {
         this.f($$1.h);
         return this.a($$0, $$1);
      }
   }

   protected abstract cvc a(int var1, cri var2);

   @Nullable
   @Override
   public alf<ezt> q() {
      return this.c;
   }

   @Override
   public void a(@Nullable alf<ezt> $$0) {
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
   public jo<czk> t() {
      return this.b;
   }

   @Override
   public void u() {
      this.b = jo.a(this.b(), czk.k);
   }
}
