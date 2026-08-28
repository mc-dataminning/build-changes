public abstract class cmx extends cms implements cna {
   private static final ajp<cud> e = ajt.a(cmx.class, ajr.h);

   public cmx(bsn<? extends cmx> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cmx(bsn<? extends cmx> $$0, double $$1, double $$2, double $$3, ewh $$4, dcg $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cmx(bsn<? extends cmx> $$0, btc $$1, ewh $$2, dcg $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cud $$0) {
      if ($$0.e()) {
         this.ar().a(e, this.y());
      } else {
         this.ar().a(e, $$0.c(1));
      }
   }

   @Override
   public cud p() {
      return this.ar().a(e);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(e, this.y());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dT()));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cud.a(this.dT(), (uu)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private cud y() {
      return new cud(cug.tX);
   }

   @Override
   public btu a_(int $$0) {
      return $$0 == 0 ? btu.a(this::p, this::a) : super.a_($$0);
   }
}
