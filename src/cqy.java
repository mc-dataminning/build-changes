import javax.annotation.Nullable;

public abstract class cqy extends cqx implements crc {
   private ka<cwq> b = ka.a(36, cwq.j);
   @Nullable
   private aku<evx> c;
   private long d;

   protected cqy(but<?> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(ard $$0, btc $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public cwq a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cwq a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwq b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cwq $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bwa a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(coy $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bum.d $$0) {
      if (!this.dV().C && $$0.a()) {
         bsh.a(this.dV(), this, this);
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
   public bsl a(coy $$0, bsk $$1) {
      return this.b_($$0);
   }

   @Override
   protected fbb a(fbb $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - csd.b(this);
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

   public void a(aku<evx> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public csd createMenu(int $$0, cox $$1, coy $$2) {
      if (this.c != null && $$2.Z_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract csd a(int var1, cox var2);

   @Nullable
   @Override
   public aku<evx> v() {
      return this.c;
   }

   @Override
   public void a(@Nullable aku<evx> $$0) {
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
   public ka<cwq> E() {
      return this.b;
   }

   @Override
   public void F() {
      this.b = ka.a(this.b(), cwq.j);
   }
}
