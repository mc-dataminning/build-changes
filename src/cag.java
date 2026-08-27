import javax.annotation.Nullable;

public abstract class cag extends caf implements caj {
   private hn<cfz> c = hn.a(36, cfz.b);
   @Nullable
   private acq d;
   private long e;

   protected cag(bfn<?> $$0, cmm $$1) {
      super($$0, $$1);
   }

   protected cag(bfn<?> $$0, double $$1, double $$2, double $$3, cmm $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(ben $$0) {
      super.a($$0);
      this.a($$0, this.dI(), this);
   }

   @Override
   public cfz a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cfz a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cfz b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cfz $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bgs a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(byo $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bfj.c $$0) {
      if (!this.dI().B && $$0.a()) {
         bdt.a(this.dI(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qr $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bdx a(byo $$0, bdw $$1) {
      return this.c_($$0);
   }

   @Override
   protected void p() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cbf.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.aV()) {
         $$0 *= 0.95F;
      }

      this.f(this.dl().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(acq $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cbf createMenu(int $$0, byn $$1, byo $$2) {
      if (this.d != null && $$2.G_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract cbf a(int var1, byn var2);

   @Nullable
   @Override
   public acq A() {
      return this.d;
   }

   @Override
   public void a(@Nullable acq $$0) {
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
   public hn<cfz> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = hn.a(this.b(), cfz.b);
   }
}
