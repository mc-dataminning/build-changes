public abstract class cnj extends cnk implements cmz {
   private static final ajp<cuc> b = ajt.a(cnj.class, ajr.h);

   public cnj(bsm<? extends cnj> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cnj(bsm<? extends cnj> $$0, double $$1, double $$2, double $$3, dcf $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cnj(bsm<? extends cnj> $$0, btb $$1, dcf $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cuc $$0) {
      this.aq().a(b, $$0.c(1));
   }

   protected abstract ctx u();

   @Override
   public cuc p() {
      return this.aq().a(b);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(b, new cuc(this.u()));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dS()));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cuc.a(this.dS(), (uu)$$0.p("Item")).orElseGet(() -> new cuc(this.u())));
      } else {
         this.a(new cuc(this.u()));
      }
   }
}
