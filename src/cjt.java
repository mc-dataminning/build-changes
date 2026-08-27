public abstract class cjt extends cju implements cjj {
   private static final aim<cqm> b = aiq.a(cjt.class, aio.h);

   public cjt(bpd<? extends cjt> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cjt(bpd<? extends cjt> $$0, double $$1, double $$2, double $$3, cxb $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cjt(bpd<? extends cjt> $$0, bpp $$1, cxb $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cqm $$0) {
      this.an().a(b, $$0.c(1));
   }

   protected abstract cqh r();

   @Override
   public cqm p() {
      return this.an().a(b);
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(b, new cqm(this.r()));
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
         this.a(new cqm(this.r()));
      }
   }
}
