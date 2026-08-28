import javax.annotation.Nullable;

public abstract class cqx extends cqw implements crb {
   private ka<cwp> b = ka.a(36, cwp.j);
   @Nullable
   private akt<evw> c;
   private long d;

   protected cqx(bur<?> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(arc $$0, bta $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public cwp a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cwp a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwp b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cwp $$1) {
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
   public boolean a(cox $$0) {
      return this.g($$0);
   }

   @Override
   public void a(buk.d $$0) {
      if (!this.dW().C && $$0.a()) {
         bsf.a(this.dW(), this, this);
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
   public bsj a(cox $$0, bsi $$1) {
      return this.b_($$0);
   }

   @Override
   protected fba a(fba $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - csc.b(this);
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

   public void a(akt<evw> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public csc createMenu(int $$0, cow $$1, cox $$2) {
      if (this.c != null && $$2.Z_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract csc a(int var1, cow var2);

   @Nullable
   @Override
   public akt<evw> v() {
      return this.c;
   }

   @Override
   public void a(@Nullable akt<evw> $$0) {
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
   public ka<cwp> B() {
      return this.b;
   }

   @Override
   public void C() {
      this.b = ka.a(this.b(), cwp.j);
   }
}
