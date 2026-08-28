import javax.annotation.Nullable;

public abstract class cou extends cot implements cox {
   private jv<cuq> c = jv.a(36, cuq.l);
   @Nullable
   private akq<eru> d;
   private long e;

   protected cou(bsx<?> $$0, dcw $$1) {
      super($$0, $$1);
   }

   protected cou(bsx<?> $$0, double $$1, double $$2, double $$3, dcw $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(brk $$0) {
      super.a($$0);
      this.a($$0, this.dP(), this);
   }

   @Override
   public cuq a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cuq a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cuq b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cuq $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bug a_(int $$0) {
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
   public void a(bsr.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bqn.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ub $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(ub $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public bqr a(cmx $$0, bqq $$1) {
      return this.c_($$0);
   }

   @Override
   protected void t() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cpu.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.bf()) {
         $$0 *= 0.95F;
      }

      this.i(this.ds().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(akq<eru> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cpu createMenu(int $$0, cmw $$1, cmx $$2) {
      if (this.d != null && $$2.R_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cpu a(int var1, cmw var2);

   @Nullable
   @Override
   public akq<eru> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable akq<eru> $$0) {
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
   public jv<cuq> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = jv.a(this.b(), cuq.l);
   }
}
