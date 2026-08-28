public abstract class cnj extends cne implements cnm {
   private static final ajw<cuq> e = aka.a(cnj.class, ajy.h);

   public cnj(bsx<? extends cnj> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cnj(bsx<? extends cnj> $$0, double $$1, double $$2, double $$3, exc $$4, dcw $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cnj(bsx<? extends cnj> $$0, btn $$1, exc $$2, dcw $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cuq $$0) {
      if ($$0.e()) {
         this.ar().a(e, this.y());
      } else {
         this.ar().a(e, $$0.c(1));
      }
   }

   @Override
   public cuq p() {
      return this.ar().a(e);
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(e, this.y());
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
         this.a(cuq.a(this.dQ(), (uy)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private cuq y() {
      return new cuq(cut.tX);
   }

   @Override
   public bug a_(int $$0) {
      return $$0 == 0 ? bug.a(this::p, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      return false;
   }
}
