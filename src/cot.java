import javax.annotation.Nullable;

public abstract class cot extends cos implements cow {
   private jr<cuo> c = jr.a(36, cuo.l);
   @Nullable
   private ald<eqm> d;
   private long e;

   protected cot(bsz<?> $$0, dbx $$1) {
      super($$0, $$1);
   }

   protected cot(bsz<?> $$0, double $$1, double $$2, double $$3, dbx $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(brm $$0) {
      super.a($$0);
      this.a($$0, this.dP(), this);
   }

   @Override
   public cuo a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cuo a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cuo b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cuo $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bug a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmw $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bst.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bqp.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ur $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(ur $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public bqt a(cmw $$0, bqs $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cpt.b(this);
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

   public void a(ald<eqm> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cpt createMenu(int $$0, cmv $$1, cmw $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract cpt a(int var1, cmv var2);

   @Nullable
   @Override
   public ald<eqm> B() {
      return this.d;
   }

   @Override
   public void a(@Nullable ald<eqm> $$0) {
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
   public jr<cuo> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = jr.a(this.b(), cuo.l);
   }
}
