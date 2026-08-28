public abstract class cnj extends cne implements cnm {
   private static final akk<cup> g = ako.a(cnj.class, akm.h);

   public cnj(bta<? extends cnj> $$0, dby $$1) {
      super($$0, $$1);
   }

   public cnj(bta<? extends cnj> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dby $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cnj(bta<? extends cnj> $$0, btp $$1, double $$2, double $$3, double $$4, dby $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cup $$0) {
      if ($$0.e()) {
         this.ap().a(g, this.y());
      } else {
         this.ap().a(g, $$0.c(1));
      }
   }

   @Override
   public cup p() {
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
         this.a(cup.a(this.dR(), (vp)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private cup y() {
      return new cup(cus.tX);
   }

   @Override
   public buh a_(int $$0) {
      return $$0 == 0 ? buh.a(this::p, this::a) : super.a_($$0);
   }
}
