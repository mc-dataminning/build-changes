import javax.annotation.Nullable;

public abstract class crr extends crq implements crv {
   private ka<cxh> b = ka.a(36, cxh.k);
   @Nullable
   private akt<ewt> c;
   private long d;

   protected crr(bvi<?> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(ard $$0, btp $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public cxh a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cxh a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cxh b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cxh $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bwq a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpr $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bva.d $$0) {
      if (!this.dU().C && $$0.a()) {
         bsu.a(this.dU(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(tq $$0) {
      super.b($$0);
      this.a($$0, this.dW());
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.b($$0, this.dW());
   }

   @Override
   public bsy a(cpr $$0, bsx $$1) {
      return this.b_($$0);
   }

   @Override
   protected fbx a(fbx $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - csw.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bj()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.aj_();
   }

   public void a(akt<ewt> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public csw createMenu(int $$0, cpq $$1, cpr $$2) {
      if (this.c != null && $$2.U_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract csw a(int var1, cpq var2);

   @Nullable
   @Override
   public akt<ewt> q() {
      return this.c;
   }

   @Override
   public void a(@Nullable akt<ewt> $$0) {
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
   public ka<cxh> t() {
      return this.b;
   }

   @Override
   public void u() {
      this.b = ka.a(this.b(), cxh.k);
   }
}
