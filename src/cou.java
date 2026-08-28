import javax.annotation.Nullable;

public abstract class cou extends cot implements cox {
   private jr<cup> c = jr.a(36, cup.l);
   @Nullable
   private ale<eqn> d;
   private long e;

   protected cou(bta<?> $$0, dby $$1) {
      super($$0, $$1);
   }

   protected cou(bta<?> $$0, double $$1, double $$2, double $$3, dby $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(brn $$0) {
      super.a($$0);
      this.a($$0, this.dP(), this);
   }

   @Override
   public cup a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cup a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cup b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cup $$1) {
      this.c($$0, $$1);
   }

   @Override
   public buh a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmx $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bsu.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bqq.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(us $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(us $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public bqu a(cmx $$0, bqt $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cpu.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.be()) {
         $$0 *= 0.95F;
      }

      this.h(this.ds().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(ale<eqn> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cpu createMenu(int $$0, cmw $$1, cmx $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cpu a(int var1, cmw var2);

   @Nullable
   @Override
   public ale<eqn> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable ale<eqn> $$0) {
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
   public jr<cup> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = jr.a(this.b(), cup.l);
   }
}
