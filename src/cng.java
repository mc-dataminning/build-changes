public abstract class cng extends cnh implements cmw {
   private static final ajp<cua> b = ajt.a(cng.class, ajr.h);

   public cng(bsj<? extends cng> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cng(bsj<? extends cng> $$0, double $$1, double $$2, double $$3, dcd $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cng(bsj<? extends cng> $$0, bsy $$1, dcd $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cua $$0) {
      this.ap().a(b, $$0.c(1));
   }

   protected abstract ctv u();

   @Override
   public cua p() {
      return this.ap().a(b);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(b, new cua(this.u()));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dR()));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cua.a(this.dR(), (uu)$$0.p("Item")).orElseGet(() -> new cua(this.u())));
      } else {
         this.a(new cua(this.u()));
      }
   }
}
