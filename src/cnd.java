import javax.annotation.Nullable;

public abstract class cnd extends cnc implements cng {
   private jf<csz> c = jf.a(36, csz.i);
   @Nullable
   private akg<eoq> d;
   private long e;

   protected cnd(brn<?> $$0, dad $$1) {
      super($$0, $$1);
   }

   protected cnd(brn<?> $$0, double $$1, double $$2, double $$3, dad $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bqf $$0) {
      super.a($$0);
      this.a($$0, this.dN(), this);
   }

   @Override
   public csz a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public csz a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public csz b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, csz $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bsr a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(clh $$0) {
      return this.g($$0);
   }

   @Override
   public void a(brh.c $$0) {
      if (!this.dN().B && $$0.a()) {
         bpi.a(this.dN(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      this.a($$0, this.dP());
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.b($$0, this.dP());
   }

   @Override
   public bpm a(clh $$0, bpl $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cod.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.bc()) {
         $$0 *= 0.95F;
      }

      this.g(this.dq().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(akg<eoq> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cod createMenu(int $$0, clg $$1, clh $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cod a(int var1, clg var2);

   @Nullable
   @Override
   public akg<eoq> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable akg<eoq> $$0) {
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
   public jf<csz> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = jf.a(this.b(), csz.i);
   }
}
