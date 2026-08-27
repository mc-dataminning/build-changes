import javax.annotation.Nullable;

public abstract class ckq extends ckp implements ckt {
   private iu<cqm> c = iu.a(36, cqm.h);
   @Nullable
   private ajh d;
   private long e;

   protected ckq(bpd<?> $$0, cxb $$1) {
      super($$0, $$1);
   }

   protected ckq(bpd<?> $$0, double $$1, double $$2, double $$3, cxb $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bnw $$0) {
      super.a($$0);
      this.a($$0, this.dM(), this);
   }

   @Override
   public cqm a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cqm a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cqm b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cqm $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bqg a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(ciu $$0) {
      return this.g($$0);
   }

   @Override
   public void a(box.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bmz.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ta $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(ta $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bnd a(ciu $$0, bnc $$1) {
      return this.c_($$0);
   }

   @Override
   protected void s() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - clq.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.bc()) {
         $$0 *= 0.95F;
      }

      this.g(this.dp().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(ajh $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public clq createMenu(int $$0, cit $$1, ciu $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract clq a(int var1, cit var2);

   @Nullable
   @Override
   public ajh B() {
      return this.d;
   }

   @Override
   public void a(@Nullable ajh $$0) {
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
   public iu<cqm> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = iu.a(this.b(), cqm.h);
   }
}
