import javax.annotation.Nullable;

public abstract class cep extends ceo implements ces {
   private il<ckj> c = il.a(36, ckj.b);
   @Nullable
   private afw d;
   private long e;

   protected cep(bjx<?> $$0, cqz $$1) {
      super($$0, $$1);
   }

   protected cep(bjx<?> $$0, double $$1, double $$2, double $$3, cqz $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bir $$0) {
      super.a($$0);
      this.a($$0, this.dL(), this);
   }

   @Override
   public ckj a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public ckj a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public ckj b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, ckj $$1) {
      this.c($$0, $$1);
   }

   @Override
   public blb a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(ccx $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bjt.c $$0) {
      if (!this.dL().B && $$0.a()) {
         bhx.a(this.dL(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(rt $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bib a(ccx $$0, bia $$1) {
      return this.c_($$0);
   }

   @Override
   protected void t() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cfp.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.aX()) {
         $$0 *= 0.95F;
      }

      this.f(this.do().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(afw $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cfp createMenu(int $$0, ccw $$1, ccx $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract cfp a(int var1, ccw var2);

   @Nullable
   @Override
   public afw B() {
      return this.d;
   }

   @Override
   public void a(@Nullable afw $$0) {
      this.d = $$0;
   }

   @Override
   public long C() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public il<ckj> E() {
      return this.c;
   }

   @Override
   public void F() {
      this.c = il.a(this.b(), ckj.b);
   }
}
