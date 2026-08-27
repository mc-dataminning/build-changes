public abstract class cik extends cil implements cia {
   private static final aie<cpd> b = aih.a(cik.class, aig.h);

   public cik(bnw<? extends cik> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cik(bnw<? extends cik> $$0, double $$1, double $$2, double $$3, cvr $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cik(bnw<? extends cik> $$0, boi $$1, cvr $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cpd $$0) {
      if (!$$0.a(this.s()) || $$0.v()) {
         this.an().b(b, $$0.c(1));
      }
   }

   protected abstract coy s();

   protected cpd u() {
      return this.an().b(b);
   }

   @Override
   public cpd q() {
      cpd $$0 = this.u();
      return $$0.b() ? new cpd(this.s()) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(b, cpd.h);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      cpd $$1 = this.u();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new sw()));
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      cpd $$1 = cpd.a($$0.p("Item"));
      this.a($$1);
   }
}
