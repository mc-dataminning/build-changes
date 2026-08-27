public abstract class cft extends cfo implements cfw {
   private static final agm<cmx> e = agp.a(cft.class, ago.h);

   public cft(bly<? extends cft> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cft(bly<? extends cft> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cto $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cft(bly<? extends cft> $$0, bmk $$1, double $$2, double $$3, double $$4, cto $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cmx $$0) {
      if (!$$0.a(cna.tS) || $$0.u()) {
         this.an().b(e, $$0.c(1));
      }
   }

   protected cmx z() {
      return this.an().b(e);
   }

   @Override
   public cmx q() {
      cmx $$0 = this.z();
      return $$0.b() ? new cmx(cna.tS) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(e, cmx.f);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      cmx $$1 = this.z();
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
