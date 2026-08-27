public abstract class cjg extends cjb implements cjj {
   private static final aim<cqm> e = aiq.a(cjg.class, aio.h);

   public cjg(bpd<? extends cjg> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cjg(bpd<? extends cjg> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cxb $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cjg(bpd<? extends cjg> $$0, bpp $$1, double $$2, double $$3, double $$4, cxb $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cqm $$0) {
      this.an().a(e, $$0.c(1));
   }

   @Override
   public cqm p() {
      return this.an().a(e);
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(e, this.y());
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Item", this.p().b(new ta()));
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cqm.a($$0.p("Item")));
      } else {
         this.a(this.y());
      }
   }

   private cqm y() {
      return new cqm(cqp.tW);
   }
}
