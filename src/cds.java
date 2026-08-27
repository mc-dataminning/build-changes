import javax.annotation.Nullable;

public abstract class cds extends cdr implements cdv {
   private hn<cjl> c = hn.a(36, cjl.b);
   @Nullable
   private aez d;
   private long e;

   protected cds(bja<?> $$0, cqb $$1) {
      super($$0, $$1);
   }

   protected cds(bja<?> $$0, double $$1, double $$2, double $$3, cqb $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bhu $$0) {
      super.a($$0);
      this.a($$0, this.dL(), this);
   }

   @Override
   public cjl a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cjl a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cjl b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cjl $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bke a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cca $$0) {
      return this.g($$0);
   }

   @Override
   public void a(biw.c $$0) {
      if (!this.dL().B && $$0.a()) {
         bha.a(this.dL(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qw $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bhe a(cca $$0, bhd $$1) {
      return this.c_($$0);
   }

   @Override
   protected void v() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cer.b(this);
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

   public void a(aez $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cer createMenu(int $$0, cbz $$1, cca $$2) {
      if (this.d != null && $$2.M_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract cer a(int var1, cbz var2);

   @Nullable
   @Override
   public aez G() {
      return this.d;
   }

   @Override
   public void a(@Nullable aez $$0) {
      this.d = $$0;
   }

   @Override
   public long H() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public hn<cjl> I() {
      return this.c;
   }

   @Override
   public void K() {
      this.c = hn.a(this.b(), cjl.b);
   }
}
