public abstract class ckx extends cks implements cla {
   private static final ajk<csd> e = ajo.a(ckx.class, ajm.h);

   public ckx(bqr<? extends ckx> $$0, czu $$1) {
      super($$0, $$1);
   }

   public ckx(bqr<? extends ckx> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, czu $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public ckx(bqr<? extends ckx> $$0, bre $$1, double $$2, double $$3, double $$4, czu $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(csd $$0) {
      if ($$0.d()) {
         this.an().a(e, this.y());
      } else {
         this.an().a(e, $$0.c(1));
      }
   }

   @Override
   public csd p() {
      return this.an().a(e);
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(e, this.y());
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dP()));
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(csd.a(this.dP(), (uv)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private csd y() {
      return new csd(csg.tX);
   }
}
