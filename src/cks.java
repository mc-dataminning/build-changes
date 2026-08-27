public abstract class cks extends ckt implements cki {
   private static final aiy<crj> b = ajc.a(cks.class, aja.h);

   public cks(bqb<? extends cks> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public cks(bqb<? extends cks> $$0, double $$1, double $$2, double $$3, cyx $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cks(bqb<? extends cks> $$0, bqo $$1, cyx $$2) {
      super($$0, $$1, $$2);
   }

   public void a(crj $$0) {
      this.an().a(b, $$0.c(1));
   }

   protected abstract cre r();

   @Override
   public crj p() {
      return this.an().a(b);
   }

   @Override
   protected void a(ajc.a $$0) {
      $$0.a(b, new crj(this.r()));
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dO()));
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(crj.a(this.dO(), (uj)$$0.p("Item")).orElseGet(() -> new crj(this.r())));
      } else {
         this.a(new crj(this.r()));
      }
   }
}
