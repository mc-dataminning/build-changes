import javax.annotation.Nullable;

public abstract class cpn extends cpm implements cpq {
   private jw<cvl> c = jw.a(36, cvl.k);
   @Nullable
   private ala<esy> d;
   private long e;

   protected cpn(btq<?> $$0, dds $$1) {
      super($$0, $$1);
   }

   protected cpn(btq<?> $$0, double $$1, double $$2, double $$3, dds $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bsb $$0) {
      super.a($$0);
      this.a($$0, this.dS(), this);
   }

   @Override
   public cvl a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cvl a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cvl b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cvl $$1) {
      this.c($$0, $$1);
   }

   @Override
   public buw a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cnp $$0) {
      return this.g($$0);
   }

   @Override
   public void a(btj.c $$0) {
      if (!this.dS().B && $$0.a()) {
         brg.a(this.dS(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(uf $$0) {
      super.b($$0);
      this.a($$0, this.dU());
   }

   @Override
   protected void a(uf $$0) {
      super.a($$0);
      this.b($$0, this.dU());
   }

   @Override
   public brk a(cnp $$0, brj $$1) {
      return this.c_($$0);
   }

   @Override
   protected eye a(eye $$0) {
      float $$1 = 0.98F;
      if (this.d == null) {
         int $$2 = 15 - cqq.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bi()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(ala<esy> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cqq createMenu(int $$0, cno $$1, cnp $$2) {
      if (this.d != null && $$2.P_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract cqq a(int var1, cno var2);

   @Nullable
   @Override
   public ala<esy> E() {
      return this.d;
   }

   @Override
   public void a(@Nullable ala<esy> $$0) {
      this.d = $$0;
   }

   @Override
   public long F() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public jw<cvl> G() {
      return this.c;
   }

   @Override
   public void I() {
      this.c = jw.a(this.b(), cvl.k);
   }
}
