public abstract class cnv extends cnw implements cnl {
   private static final akj<cuo> b = akn.a(cnv.class, akl.h);

   public cnv(bsz<? extends cnv> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public cnv(bsz<? extends cnv> $$0, double $$1, double $$2, double $$3, dbx $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cnv(bsz<? extends cnv> $$0, bto $$1, dbx $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cuo $$0) {
      this.ap().a(b, $$0.c(1));
   }

   protected abstract cuj u();

   @Override
   public cuo p() {
      return this.ap().a(b);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(b, new cuo(this.u()));
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
         this.a(cuo.a(this.dR(), (vo)$$0.p("Item")).orElseGet(() -> new cuo(this.u())));
      } else {
         this.a(new cuo(this.u()));
      }
   }
}
