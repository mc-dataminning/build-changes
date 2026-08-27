public abstract class bzm extends bzn implements bzd {
   private static final aby<cfz> b = acb.a(bzm.class, aca.h);

   public bzm(bfn<? extends bzm> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bzm(bfn<? extends bzm> $$0, double $$1, double $$2, double $$3, cmm $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public bzm(bfn<? extends bzm> $$0, bfz $$1, cmm $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cfz $$0) {
      if (!$$0.a(this.k()) || $$0.u()) {
         this.aj().b(b, $$0.c(1));
      }
   }

   protected abstract cfu k();

   protected cfz o() {
      return this.aj().b(b);
   }

   @Override
   public cfz j() {
      cfz $$0 = this.o();
      return $$0.b() ? new cfz(this.k()) : $$0;
   }

   @Override
   protected void a_() {
      this.aj().a(b, cfz.b);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      cfz $$1 = this.o();
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
