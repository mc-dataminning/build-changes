public abstract class ckf extends cka implements cki {
   private static final aiy<crj> e = ajc.a(ckf.class, aja.h);

   public ckf(bqb<? extends ckf> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public ckf(bqb<? extends ckf> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cyx $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public ckf(bqb<? extends ckf> $$0, bqo $$1, double $$2, double $$3, double $$4, cyx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(crj $$0) {
      if ($$0.d()) {
         this.an().a(e, this.y());
      } else {
         this.an().a(e, $$0.c(1));
      }
   }

   @Override
   public crj p() {
      return this.an().a(e);
   }

   @Override
   protected void a(ajc.a $$0) {
      $$0.a(e, this.y());
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
         this.a(crj.a(this.dO(), (uj)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private crj y() {
      return new crj(crm.tW);
   }
}
