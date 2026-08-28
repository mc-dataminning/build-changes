public abstract class cnx extends cny implements cnn {
   private static final akk<cuq> b = ako.a(cnx.class, akm.h);

   public cnx(btb<? extends cnx> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cnx(btb<? extends cnx> $$0, double $$1, double $$2, double $$3, dbz $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cnx(btb<? extends cnx> $$0, btq $$1, dbz $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cuq $$0) {
      this.ap().a(b, $$0.c(1));
   }

   protected abstract cul u();

   @Override
   public cuq p() {
      return this.ap().a(b);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(b, new cuq(this.u()));
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
         this.a(cuq.a(this.dR(), (vp)$$0.p("Item")).orElseGet(() -> new cuq(this.u())));
      } else {
         this.a(new cuq(this.u()));
      }
   }
}
