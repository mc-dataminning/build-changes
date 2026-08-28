import javax.annotation.Nullable;

public abstract class cod extends coc implements cog {
   private js<cua> c = js.a(36, cua.l);
   @Nullable
   private akj<eqt> d;
   private long e;

   protected cod(bsj<?> $$0, dcd $$1) {
      super($$0, $$1);
   }

   protected cod(bsj<?> $$0, double $$1, double $$2, double $$3, dcd $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bqw $$0) {
      super.a($$0);
      this.a($$0, this.dP(), this);
   }

   @Override
   public cua a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cua a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cua b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cua $$1) {
      this.c($$0, $$1);
   }

   @Override
   public btq a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmh $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bsd.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bpz.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public bqd a(cmh $$0, bqc $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cpe.b(this);
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

   public void a(akj<eqt> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cpe createMenu(int $$0, cmg $$1, cmh $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cpe a(int var1, cmg var2);

   @Nullable
   @Override
   public akj<eqt> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable akj<eqt> $$0) {
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
   public js<cua> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = js.a(this.b(), cua.l);
   }
}
