public abstract class clt extends clo implements clw {
   private static final ajm<csz> e = ajq.a(clt.class, ajo.h);

   public clt(brn<? extends clt> $$0, dad $$1) {
      super($$0, $$1);
   }

   public clt(brn<? extends clt> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dad $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public clt(brn<? extends clt> $$0, bsa $$1, double $$2, double $$3, double $$4, dad $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(csz $$0) {
      if ($$0.d()) {
         this.an().a(e, this.y());
      } else {
         this.an().a(e, $$0.c(1));
      }
   }

   @Override
   public csz p() {
      return this.an().a(e);
   }

   @Override
   protected void a(ajq.a $$0) {
      $$0.a(e, this.y());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dP()));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(csz.a(this.dP(), (ux)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private csz y() {
      return new csz(ctc.tX);
   }
}
