public abstract class ccl extends ccm implements ccc {
   private static final adz<ciy> b = aec.a(ccl.class, aeb.h);

   public ccl(bim<? extends ccl> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public ccl(bim<? extends ccl> $$0, double $$1, double $$2, double $$3, cpm $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public ccl(bim<? extends ccl> $$0, biy $$1, cpm $$2) {
      super($$0, $$1, $$2);
   }

   public void a(ciy $$0) {
      if (!$$0.a(this.m()) || $$0.u()) {
         this.al().b(b, $$0.c(1));
      }
   }

   protected abstract cit m();

   protected ciy o() {
      return this.al().b(b);
   }

   @Override
   public ciy j() {
      ciy $$0 = this.o();
      return $$0.b() ? new ciy(this.m()) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(b, ciy.b);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      ciy $$1 = this.o();
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
