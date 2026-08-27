public abstract class cfu extends cfp implements cfx {
   private static final agm<cmy> e = agp.a(cfu.class, ago.h);

   public cfu(blz<? extends cfu> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public cfu(blz<? extends cfu> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ctp $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cfu(blz<? extends cfu> $$0, bml $$1, double $$2, double $$3, double $$4, ctp $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cmy $$0) {
      if (!$$0.a(cnb.tS) || $$0.u()) {
         this.an().b(e, $$0.c(1));
      }
   }

   protected cmy z() {
      return this.an().b(e);
   }

   @Override
   public cmy q() {
      cmy $$0 = this.z();
      return $$0.b() ? new cmy(cnb.tS) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(e, cmy.f);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      cmy $$1 = this.z();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new sn()));
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      cmy $$1 = cmy.a($$0.p("Item"));
      this.a($$1);
   }
}
