public abstract class cnh extends cnc implements cnk {
   private static final ajv<cuo> e = ajz.a(cnh.class, ajx.h);

   public cnh(bsw<? extends cnh> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cnh(bsw<? extends cnh> $$0, double $$1, double $$2, double $$3, eww $$4, dcu $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cnh(bsw<? extends cnh> $$0, btl $$1, eww $$2, dcu $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cuo $$0) {
      if ($$0.e()) {
         this.ar().a(e, this.y());
      } else {
         this.ar().a(e, $$0.c(1));
      }
   }

   @Override
   public cuo p() {
      return this.ar().a(e);
   }

   @Override
   protected void a(ajz.a $$0) {
      $$0.a(e, this.y());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dS()));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cuo.a(this.dS(), (ux)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private cuo y() {
      return new cuo(cur.tX);
   }

   @Override
   public bue a_(int $$0) {
      return $$0 == 0 ? bue.a(this::p, this::a) : super.a_($$0);
   }
}
