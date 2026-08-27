public class esq extends esa {
   private final ert a;
   private final eta b;

   public esq(int $$0, int $$1, int $$2, int $$3, tf $$4, ert $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
      this.b = new eta($$4, $$5).j(this.l() - this.b());
   }

   public esq a(int $$0) {
      this.b.i($$0);
      return this;
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.b.j(this.l() - this.b());
   }

   @Override
   protected int g() {
      return this.b.i();
   }

   @Override
   protected double h() {
      return 9.0;
   }

   @Override
   protected void b(erv $$0) {
      if (this.e()) {
         super.b($$0);
      } else if (this.aw_()) {
         this.a($$0, this.r() - this.a(), this.t() - this.a(), this.l() + this.b(), this.i() + this.b());
      }
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      if (this.j) {
         if (!this.e()) {
            this.b($$0);
            $$0.c().a();
            $$0.c().a((float)this.r(), (float)this.t(), 0.0F);
            this.b.a($$0, $$1, $$2, $$3);
            $$0.c().b();
         } else {
            super.b($$0, $$1, $$2, $$3);
         }
      }
   }

   public boolean v() {
      return super.e();
   }

   @Override
   protected void c(erv $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)(this.r() + this.a()), (float)(this.t() + this.a()), 0.0F);
      this.b.a($$0, $$1, $$2, $$3);
      $$0.c().b();
   }

   @Override
   protected void a(evy $$0) {
      $$0.a(evx.a, this.m());
   }
}
