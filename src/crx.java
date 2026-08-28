import javax.annotation.Nullable;

public abstract class crx extends crw implements csb {
   private jz<cxp> b = jz.a(36, cxp.j);
   @Nullable
   private aly<ewu> c;
   private long d;

   protected crx(bvr<?> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(ash $$0, bua $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public cxp a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cxp a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cxp b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cxp $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bwy a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpx $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bvk.d $$0) {
      if (!this.dW().C && $$0.a()) {
         btf.a(this.dW(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ux $$0) {
      super.b($$0);
      this.a($$0, this.dY());
   }

   @Override
   protected void a(ux $$0) {
      super.a($$0);
      this.b($$0, this.dY());
   }

   @Override
   public btj a(cpx $$0, bti $$1) {
      return this.b_($$0);
   }

   @Override
   protected fby a(fby $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - ctc.b(this);
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

   public void a(aly<ewu> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public ctc createMenu(int $$0, cpw $$1, cpx $$2) {
      if (this.c != null && $$2.aa_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract ctc a(int var1, cpw var2);

   @Nullable
   @Override
   public aly<ewu> v() {
      return this.c;
   }

   @Override
   public void a(@Nullable aly<ewu> $$0) {
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
   public jz<cxp> B() {
      return this.b;
   }

   @Override
   public void C() {
      this.b = jz.a(this.b(), cxp.j);
   }
}
