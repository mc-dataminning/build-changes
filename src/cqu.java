import javax.annotation.Nullable;

public abstract class cqu extends cqt implements cqy {
   private jz<cwm> b = jz.a(36, cwm.k);
   @Nullable
   private ali<eus> c;
   private long d;

   protected cqu(bus<?> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(arp $$0, btb $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public cwm a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cwm a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwm b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cwm $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvz a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cou $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bul.c $$0) {
      if (!this.dV().C && $$0.a()) {
         bsg.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ul $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(ul $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public bsk a(cou $$0, bsj $$1) {
      return this.b_($$0);
   }

   @Override
   protected ezy a(ezy $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - crz.b(this);
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

   public void a(ali<eus> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public crz createMenu(int $$0, cot $$1, cou $$2) {
      if (this.c != null && $$2.Y_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract crz a(int var1, cot var2);

   @Nullable
   @Override
   public ali<eus> u() {
      return this.c;
   }

   @Override
   public void a(@Nullable ali<eus> $$0) {
      this.c = $$0;
   }

   @Override
   public long v() {
      return this.d;
   }

   @Override
   public void a(long $$0) {
      this.d = $$0;
   }

   @Override
   public jz<cwm> B() {
      return this.b;
   }

   @Override
   public void C() {
      this.b = jz.a(this.b(), cwm.k);
   }
}
