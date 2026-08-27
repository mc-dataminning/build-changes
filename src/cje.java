public abstract class cje extends ciz implements cjh {
   private static final aim<cqk> e = aiq.a(cje.class, aio.h);

   public cje(bpc<? extends cje> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public cje(bpc<? extends cje> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cwz $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cje(bpc<? extends cje> $$0, bpo $$1, double $$2, double $$3, double $$4, cwz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cqk $$0) {
      this.an().a(e, $$0.c(1));
   }

   @Override
   public cqk p() {
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
         this.a(cqk.a($$0.p("Item")));
      } else {
         this.a(this.y());
      }
   }

   private cqk y() {
      return new cqk(cqn.tV);
   }
}
