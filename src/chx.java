public abstract class chx extends chs implements cia {
   private static final aie<cpd> e = aih.a(chx.class, aig.h);

   public chx(bnw<? extends chx> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public chx(bnw<? extends chx> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cvr $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public chx(bnw<? extends chx> $$0, boi $$1, double $$2, double $$3, double $$4, cvr $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cpd $$0) {
      if (!$$0.a(cpg.tV) || $$0.v()) {
         this.an().b(e, $$0.c(1));
      }
   }

   protected cpd z() {
      return this.an().b(e);
   }

   @Override
   public cpd q() {
      cpd $$0 = this.z();
      return $$0.b() ? new cpd(cpg.tV) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(e, cpd.h);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      cpd $$1 = this.z();
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
