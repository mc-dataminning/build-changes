import javax.annotation.Nullable;

public abstract class cog extends cof implements coj {
   private js<cuc> c = js.a(36, cuc.l);
   @Nullable
   private akj<eqz> d;
   private long e;

   protected cog(bsm<?> $$0, dcf $$1) {
      super($$0, $$1);
   }

   protected cog(bsm<?> $$0, double $$1, double $$2, double $$3, dcf $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bqz $$0) {
      super.a($$0);
      this.a($$0, this.dQ(), this);
   }

   @Override
   public cuc a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cuc a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cuc b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cuc $$1) {
      this.c($$0, $$1);
   }

   @Override
   public btt a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmk $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bsg.c $$0) {
      if (!this.dQ().B && $$0.a()) {
         bqc.a(this.dQ(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      this.a($$0, this.dS());
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.b($$0, this.dS());
   }

   @Override
   public bqg a(cmk $$0, bqf $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cph.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.bf()) {
         $$0 *= 0.95F;
      }

      this.i(this.dt().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(akj<eqz> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cph createMenu(int $$0, cmj $$1, cmk $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cph a(int var1, cmj var2);

   @Nullable
   @Override
   public akj<eqz> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable akj<eqz> $$0) {
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
   public js<cuc> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = js.a(this.b(), cuc.l);
   }
}
