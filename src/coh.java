import javax.annotation.Nullable;

public abstract class coh extends cog implements cok {
   private js<cud> c = js.a(36, cud.l);
   @Nullable
   private akj<erb> d;
   private long e;

   protected coh(bsn<?> $$0, dcg $$1) {
      super($$0, $$1);
   }

   protected coh(bsn<?> $$0, double $$1, double $$2, double $$3, dcg $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bra $$0) {
      super.a($$0);
      this.a($$0, this.dR(), this);
   }

   @Override
   public cud a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cud a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cud b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cud $$1) {
      this.c($$0, $$1);
   }

   @Override
   public btu a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cml $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bsh.d $$0) {
      if (!this.dR().B && $$0.a()) {
         bqd.a(this.dR(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      this.a($$0, this.dT());
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.b($$0, this.dT());
   }

   @Override
   public bqh a(cml $$0, bqg $$1) {
      return this.c_($$0);
   }

   @Override
   protected void t() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cpi.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.bg()) {
         $$0 *= 0.95F;
      }

      this.j(this.du().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(akj<erb> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cpi createMenu(int $$0, cmk $$1, cml $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cpi a(int var1, cmk var2);

   @Nullable
   @Override
   public akj<erb> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable akj<erb> $$0) {
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
   public js<cud> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = js.a(this.b(), cud.l);
   }
}
