public abstract class cni extends cnd implements cnl {
   private static final akj<cuo> g = akn.a(cni.class, akl.h);

   public cni(bsz<? extends cni> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public cni(bsz<? extends cni> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dbx $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cni(bsz<? extends cni> $$0, bto $$1, double $$2, double $$3, double $$4, dbx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cuo $$0) {
      if ($$0.e()) {
         this.ap().a(g, this.y());
      } else {
         this.ap().a(g, $$0.c(1));
      }
   }

   @Override
   public cuo p() {
      return this.ap().a(g);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(g, this.y());
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dR()));
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cuo.a(this.dR(), (vo)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private cuo y() {
      return new cuo(cur.tX);
   }

   @Override
   public bug a_(int $$0) {
      return $$0 == 0 ? bug.a(this::p, this::a) : super.a_($$0);
   }
}
