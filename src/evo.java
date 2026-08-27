public class evo extends euy {
   private final eur a;
   private final evy b;

   public evo(int $$0, int $$1, int $$2, int $$3, uv $$4, eur $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
      this.b = new evy($$4, $$5).j(this.k() - this.b());
   }

   public evo a(int $$0) {
      this.b.i($$0);
      return this;
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.b.j(this.k() - this.b());
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
   protected void b(eut $$0) {
      if (this.e()) {
         super.b($$0);
      } else if (this.aK_()) {
         this.a($$0, this.p() - this.a(), this.r() - this.a(), this.k() + this.b(), this.i() + this.b());
      }
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      if (this.j) {
         if (!this.e()) {
            this.b($$0);
            $$0.c().a();
            $$0.c().a((float)this.p(), (float)this.r(), 0.0F);
            this.b.a($$0, $$1, $$2, $$3);
            $$0.c().b();
         } else {
            super.b($$0, $$1, $$2, $$3);
         }
      }
   }

   public boolean u() {
      return super.e();
   }

   @Override
   protected void c(eut $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)(this.p() + this.a()), (float)(this.r() + this.a()), 0.0F);
      this.b.a($$0, $$1, $$2, $$3);
      $$0.c().b();
   }

   @Override
   protected void a(eyx $$0) {
      $$0.a(eyw.a, this.l());
   }
}
