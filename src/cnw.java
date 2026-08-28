public abstract class cnw extends cnx implements cnm {
   private static final ajw<cuq> b = aka.a(cnw.class, ajy.h);

   public cnw(bsx<? extends cnw> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cnw(bsx<? extends cnw> $$0, double $$1, double $$2, double $$3, dcw $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cnw(bsx<? extends cnw> $$0, btn $$1, dcw $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cuq $$0) {
      this.ar().a(b, $$0.c(1));
   }

   protected abstract cul t();

   @Override
   public cuq p() {
      return this.ar().a(b);
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(b, new cuq(this.t()));
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dQ()));
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cuq.a(this.dQ(), (uy)$$0.p("Item")).orElseGet(() -> new cuq(this.t())));
      } else {
         this.a(new cuq(this.t()));
      }
   }
}
