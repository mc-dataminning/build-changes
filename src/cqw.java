import javax.annotation.Nullable;

public abstract class cqw extends cqv implements cra {
   private ka<cwo> b = ka.a(36, cwo.j);
   @Nullable
   private aku<evv> c;
   private long d;

   protected cqw(bur<?> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(ard $$0, bta $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public cwo a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cwo a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwo b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cwo $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvy a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cow $$0) {
      return this.g($$0);
   }

   @Override
   public void a(buk.d $$0) {
      if (!this.dV().C && $$0.a()) {
         bsf.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(tq $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public bsj a(cow $$0, bsi $$1) {
      return this.b_($$0);
   }

   @Override
   protected faz a(faz $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - csb.b(this);
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

   public void a(aku<evv> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public csb createMenu(int $$0, cov $$1, cow $$2) {
      if (this.c != null && $$2.Z_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract csb a(int var1, cov var2);

   @Nullable
   @Override
   public aku<evv> v() {
      return this.c;
   }

   @Override
   public void a(@Nullable aku<evv> $$0) {
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
   public ka<cwo> E() {
      return this.b;
   }

   @Override
   public void F() {
      this.b = ka.a(this.b(), cwo.j);
   }
}
