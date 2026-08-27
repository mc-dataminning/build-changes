public abstract class cgf extends cgg implements cfw {
   private static final agm<cmx> b = agp.a(cgf.class, ago.h);

   public cgf(bly<? extends cgf> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cgf(bly<? extends cgf> $$0, double $$1, double $$2, double $$3, cto $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cgf(bly<? extends cgf> $$0, bmk $$1, cto $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cmx $$0) {
      if (!$$0.a(this.s()) || $$0.u()) {
         this.an().b(b, $$0.c(1));
      }
   }

   protected abstract cms s();

   protected cmx u() {
      return this.an().b(b);
   }

   @Override
   public cmx q() {
      cmx $$0 = this.u();
      return $$0.b() ? new cmx(this.s()) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(b, cmx.f);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      cmx $$1 = this.u();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new sn()));
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      cmx $$1 = cmx.a($$0.p("Item"));
      this.a($$1);
   }
}
