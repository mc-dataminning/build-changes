public abstract class cck extends ccl implements ccb {
   private static final adz<cix> b = aec.a(cck.class, aeb.h);

   public cck(bim<? extends cck> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public cck(bim<? extends cck> $$0, double $$1, double $$2, double $$3, cpl $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cck(bim<? extends cck> $$0, biy $$1, cpl $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cix $$0) {
      if (!$$0.a(this.m()) || $$0.u()) {
         this.al().b(b, $$0.c(1));
      }
   }

   protected abstract cis m();

   protected cix o() {
      return this.al().b(b);
   }

   @Override
   public cix j() {
      cix $$0 = this.o();
      return $$0.b() ? new cix(this.m()) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(b, cix.b);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      cix $$1 = this.o();
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
