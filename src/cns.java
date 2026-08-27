import javax.annotation.Nullable;

public abstract class cns extends cnr implements cnv {
   private jg<cto> c = jg.a(36, cto.i);
   @Nullable
   private akl<epk> d;
   private long e;

   protected cns(bsa<?> $$0, dax $$1) {
      super($$0, $$1);
   }

   protected cns(bsa<?> $$0, double $$1, double $$2, double $$3, dax $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bqn $$0) {
      super.a($$0);
      this.a($$0, this.dP(), this);
   }

   @Override
   public cto a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cto a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cto b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cto $$1) {
      this.c($$0, $$1);
   }

   @Override
   public btg a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(clw $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bru.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bpq.a(this.dP(), this, this);
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
   public bpu a(clw $$0, bpt $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cot.b(this);
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

   public void a(akl<epk> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cot createMenu(int $$0, clv $$1, clw $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cot a(int var1, clv var2);

   @Nullable
   @Override
   public akl<epk> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable akl<epk> $$0) {
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
   public jg<cto> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = jg.a(this.b(), cto.i);
   }
}
