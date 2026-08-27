public abstract class cbz extends cbu implements ccc {
   private static final adz<ciy> e = aec.a(cbz.class, aeb.h);

   public cbz(bim<? extends cbz> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public cbz(bim<? extends cbz> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cpm $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cbz(bim<? extends cbz> $$0, biy $$1, double $$2, double $$3, double $$4, cpm $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ciy $$0) {
      if (!$$0.a(cjb.tf) || $$0.u()) {
         this.al().b(e, $$0.c(1));
      }
   }

   protected ciy p() {
      return this.al().b(e);
   }

   @Override
   public ciy j() {
      ciy $$0 = this.p();
      return $$0.b() ? new ciy(cjb.tf) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(e, ciy.b);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      ciy $$1 = this.p();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qr()));
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      ciy $$1 = ciy.a($$0.p("Item"));
      this.a($$1);
   }
}
