public abstract class cnk extends cnl implements cna {
   private static final ajp<cud> b = ajt.a(cnk.class, ajr.h);

   public cnk(bsn<? extends cnk> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cnk(bsn<? extends cnk> $$0, double $$1, double $$2, double $$3, dcg $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cnk(bsn<? extends cnk> $$0, btc $$1, dcg $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cud $$0) {
      this.ar().a(b, $$0.c(1));
   }

   protected abstract cty t();

   @Override
   public cud p() {
      return this.ar().a(b);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(b, new cud(this.t()));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dT()));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cud.a(this.dT(), (uu)$$0.p("Item")).orElseGet(() -> new cud(this.t())));
      } else {
         this.a(new cud(this.t()));
      }
   }
}
