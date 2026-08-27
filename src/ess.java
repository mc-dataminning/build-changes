public class ess extends esc {
   private final erv a;
   private final etc b;

   public ess(int $$0, int $$1, int $$2, int $$3, te $$4, erv $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
      this.b = new etc($$4, $$5).i(this.k() - this.b());
   }

   public ess a(int $$0) {
      this.b.h($$0);
      return this;
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.b.i(this.k() - this.b());
   }

   @Override
   protected int f() {
      return this.b.h();
   }

   @Override
   protected double g() {
      return 9.0;
   }

   @Override
   protected void b(erx $$0) {
      if (this.e()) {
         super.b($$0);
      } else if (this.ax_()) {
         this.a($$0, this.p() - this.a(), this.r() - this.a(), this.k() + this.b(), this.h() + this.b());
      }
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
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

   @Override
   protected void c(erx $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)(this.p() + this.a()), (float)(this.r() + this.a()), 0.0F);
      this.b.a($$0, $$1, $$2, $$3);
      $$0.c().b();
   }

   @Override
   protected void a(evt $$0) {
      $$0.a(evs.a, this.l());
   }
}
