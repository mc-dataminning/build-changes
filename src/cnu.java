import javax.annotation.Nullable;

public abstract class cnu extends cnt implements cnx {
   private jg<ctq> c = jg.a(36, ctq.i);
   @Nullable
   private akm<epm> d;
   private long e;

   protected cnu(bsc<?> $$0, daz $$1) {
      super($$0, $$1);
   }

   protected cnu(bsc<?> $$0, double $$1, double $$2, double $$3, daz $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bqp $$0) {
      super.a($$0);
      this.a($$0, this.dP(), this);
   }

   @Override
   public ctq a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public ctq a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public ctq b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, ctq $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bti a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cly $$0) {
      return this.g($$0);
   }

   @Override
   public void a(brw.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bps.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ud $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(ud $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public bpw a(cly $$0, bpv $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cov.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.be()) {
         $$0 *= 0.95F;
      }

      this.g(this.ds().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(akm<epm> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cov createMenu(int $$0, clx $$1, cly $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cov a(int var1, clx var2);

   @Nullable
   @Override
   public akm<epm> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable akm<epm> $$0) {
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
   public jg<ctq> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = jg.a(this.b(), ctq.i);
   }
}
