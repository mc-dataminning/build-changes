public abstract class cmw extends cmr implements cmz {
   private static final ajp<cuc> e = ajt.a(cmw.class, ajr.h);

   public cmw(bsm<? extends cmw> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cmw(bsm<? extends cmw> $$0, double $$1, double $$2, double $$3, ewf $$4, dcf $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cmw(bsm<? extends cmw> $$0, btb $$1, ewf $$2, dcf $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cuc $$0) {
      if ($$0.e()) {
         this.aq().a(e, this.y());
      } else {
         this.aq().a(e, $$0.c(1));
      }
   }

   @Override
   public cuc p() {
      return this.aq().a(e);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(e, this.y());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dS()));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cuc.a(this.dS(), (uu)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private cuc y() {
      return new cuc(cuf.tX);
   }

   @Override
   public btt a_(int $$0) {
      return $$0 == 0 ? btt.a(this::p, this::a) : super.a_($$0);
   }
}
