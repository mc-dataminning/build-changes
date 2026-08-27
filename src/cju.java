import javax.annotation.Nullable;

public abstract class cju extends cjt implements cjx {
   private iu<cpq> c = iu.a(36, cpq.h);
   @Nullable
   private ajc d;
   private long e;

   protected cju(bol<?> $$0, cwe $$1) {
      super($$0, $$1);
   }

   protected cju(bol<?> $$0, double $$1, double $$2, double $$3, cwe $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bne $$0) {
      super.a($$0);
      this.a($$0, this.dJ(), this);
   }

   @Override
   public cpq a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cpq a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cpq b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cpq $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bpo a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cia $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bof.c $$0) {
      if (!this.dJ().B && $$0.a()) {
         bmh.a(this.dJ(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(sy $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sy $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bml a(cia $$0, bmk $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cku.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.aZ()) {
         $$0 *= 0.95F;
      }

      this.g(this.dm().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(ajc $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cku createMenu(int $$0, chz $$1, cia $$2) {
      if (this.d != null && $$2.P_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract cku a(int var1, chz var2);

   @Nullable
   @Override
   public ajc C() {
      return this.d;
   }

   @Override
   public void a(@Nullable ajc $$0) {
      this.d = $$0;
   }

   @Override
   public long D() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public iu<cpq> E() {
      return this.c;
   }

   @Override
   public void G() {
      this.c = iu.a(this.b(), cpq.h);
   }
}
