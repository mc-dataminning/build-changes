public abstract class cfn extends cfi implements cfq {
   private static final agj<cmr> e = agm.a(cfn.class, agl.h);

   public cfn(blt<? extends cfn> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cfn(blt<? extends cfn> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cti $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cfn(blt<? extends cfn> $$0, bmf $$1, double $$2, double $$3, double $$4, cti $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cmr $$0) {
      if (!$$0.a(cmu.tS) || $$0.u()) {
         this.an().b(e, $$0.c(1));
      }
   }

   protected cmr y() {
      return this.an().b(e);
   }

   @Override
   public cmr q() {
      cmr $$0 = this.y();
      return $$0.b() ? new cmr(cmu.tS) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(e, cmr.f);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      cmr $$1 = this.y();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new sl()));
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      cmr $$1 = cmr.a($$0.p("Item"));
      this.a($$1);
   }
}
