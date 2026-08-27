public abstract class cby extends cbt implements ccb {
   private static final adz<cix> e = aec.a(cby.class, aeb.h);

   public cby(bim<? extends cby> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public cby(bim<? extends cby> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cpl $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cby(bim<? extends cby> $$0, biy $$1, double $$2, double $$3, double $$4, cpl $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cix $$0) {
      if (!$$0.a(cja.tf) || $$0.u()) {
         this.al().b(e, $$0.c(1));
      }
   }

   protected cix p() {
      return this.al().b(e);
   }

   @Override
   public cix j() {
      cix $$0 = this.p();
      return $$0.b() ? new cix(cja.tf) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(e, cix.b);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      cix $$1 = this.p();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qr()));
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      cix $$1 = cix.a($$0.p("Item"));
      this.a($$1);
   }
}
