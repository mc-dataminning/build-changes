public abstract class cgc extends cfx implements cgf {
   private static final agn<cng> e = agq.a(cgc.class, agp.h);

   public cgc(bmc<? extends cgc> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgc(bmc<? extends cgc> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ctx $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cgc(bmc<? extends cgc> $$0, bmo $$1, double $$2, double $$3, double $$4, ctx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cng $$0) {
      if (!$$0.a(cnj.tV) || $$0.u()) {
         this.an().b(e, $$0.c(1));
      }
   }

   protected cng z() {
      return this.an().b(e);
   }

   @Override
   public cng q() {
      cng $$0 = this.z();
      return $$0.b() ? new cng(cnj.tV) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(e, cng.f);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      cng $$1 = this.z();
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
