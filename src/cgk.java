import javax.annotation.Nullable;

public abstract class cgk extends cgj implements cgn {
   private io<cmh> c = io.a(36, cmh.f);
   @Nullable
   private agt d;
   private long e;

   protected cgk(blj<?> $$0, csy $$1) {
      super($$0, $$1);
   }

   protected cgk(blj<?> $$0, double $$1, double $$2, double $$3, csy $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bkd $$0) {
      super.a($$0);
      this.a($$0, this.dM(), this);
   }

   @Override
   public cmh a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cmh a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cmh b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cmh $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bmn a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cer $$0) {
      return this.g($$0);
   }

   @Override
   public void a(blf.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bjh.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sj $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bjl a(cer $$0, bjk $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - chk.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.aZ()) {
         $$0 *= 0.95F;
      }

      this.g(this.dp().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(agt $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public chk createMenu(int $$0, ceq $$1, cer $$2) {
      if (this.d != null && $$2.P_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract chk a(int var1, ceq var2);

   @Nullable
   @Override
   public agt C() {
      return this.d;
   }

   @Override
   public void a(@Nullable agt $$0) {
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
   public io<cmh> E() {
      return this.c;
   }

   @Override
   public void G() {
      this.c = io.a(this.b(), cmh.f);
   }
}
