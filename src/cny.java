public abstract class cny extends cnz implements cno {
   private static final akk<cur> b = ako.a(cny.class, akm.h);

   public cny(btc<? extends cny> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cny(btc<? extends cny> $$0, double $$1, double $$2, double $$3, dca $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cny(btc<? extends cny> $$0, btr $$1, dca $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cur $$0) {
      this.ap().a(b, $$0.c(1));
   }

   protected abstract cum u();

   @Override
   public cur p() {
      return this.ap().a(b);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(b, new cur(this.u()));
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dR()));
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cur.a(this.dR(), (vp)$$0.p("Item")).orElseGet(() -> new cur(this.u())));
      } else {
         this.a(new cur(this.u()));
      }
   }
}
