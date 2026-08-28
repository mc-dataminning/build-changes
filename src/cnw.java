public abstract class cnw extends cnx implements cnm {
   private static final akk<cup> b = ako.a(cnw.class, akm.h);

   public cnw(bta<? extends cnw> $$0, dby $$1) {
      super($$0, $$1);
   }

   public cnw(bta<? extends cnw> $$0, double $$1, double $$2, double $$3, dby $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cnw(bta<? extends cnw> $$0, btp $$1, dby $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cup $$0) {
      this.ap().a(b, $$0.c(1));
   }

   protected abstract cuk u();

   @Override
   public cup p() {
      return this.ap().a(b);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(b, new cup(this.u()));
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
         this.a(cup.a(this.dR(), (vp)$$0.p("Item")).orElseGet(() -> new cup(this.u())));
      } else {
         this.a(new cup(this.u()));
      }
   }
}
