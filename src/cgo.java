public abstract class cgo extends cgp implements cgf {
   private static final agn<cng> b = agq.a(cgo.class, agp.h);

   public cgo(bmc<? extends cgo> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgo(bmc<? extends cgo> $$0, double $$1, double $$2, double $$3, ctx $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cgo(bmc<? extends cgo> $$0, bmo $$1, ctx $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cng $$0) {
      if (!$$0.a(this.s()) || $$0.u()) {
         this.an().b(b, $$0.c(1));
      }
   }

   protected abstract cnb s();

   protected cng u() {
      return this.an().b(b);
   }

   @Override
   public cng q() {
      cng $$0 = this.u();
      return $$0.b() ? new cng(this.s()) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(b, cng.f);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      cng $$1 = this.u();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new so()));
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      cng $$1 = cng.a($$0.p("Item"));
      this.a($$1);
   }
}
