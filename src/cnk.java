public abstract class cnk extends cnf implements cnn {
   private static final akk<cuq> g = ako.a(cnk.class, akm.h);

   public cnk(btb<? extends cnk> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cnk(btb<? extends cnk> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dbz $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cnk(btb<? extends cnk> $$0, btq $$1, double $$2, double $$3, double $$4, dbz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cuq $$0) {
      if ($$0.e()) {
         this.ap().a(g, this.y());
      } else {
         this.ap().a(g, $$0.c(1));
      }
   }

   @Override
   public cuq p() {
      return this.ap().a(g);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(g, this.y());
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
         this.a(cuq.a(this.dR(), (vp)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private cuq y() {
      return new cuq(cut.tX);
   }

   @Override
   public bui a_(int $$0) {
      return $$0 == 0 ? bui.a(this::p, this::a) : super.a_($$0);
   }
}
