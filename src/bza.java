public abstract class bza extends byv implements bzd {
   private static final aby<cfz> e = acb.a(bza.class, aca.h);

   public bza(bfn<? extends bza> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bza(bfn<? extends bza> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cmm $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public bza(bfn<? extends bza> $$0, bfz $$1, double $$2, double $$3, double $$4, cmm $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cfz $$0) {
      if (!$$0.a(cgc.tf) || $$0.u()) {
         this.aj().b(e, $$0.c(1));
      }
   }

   protected cfz p() {
      return this.aj().b(e);
   }

   @Override
   public cfz j() {
      cfz $$0 = this.p();
      return $$0.b() ? new cfz(cgc.tf) : $$0;
   }

   @Override
   protected void a_() {
      this.aj().a(e, cfz.b);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      cfz $$1 = this.p();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qr()));
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      cfz $$1 = cfz.a($$0.p("Item"));
      this.a($$1);
   }
}
