public abstract class cnu extends cnv implements cnk {
   private static final ajv<cuo> b = ajz.a(cnu.class, ajx.h);

   public cnu(bsw<? extends cnu> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cnu(bsw<? extends cnu> $$0, double $$1, double $$2, double $$3, dcu $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cnu(bsw<? extends cnu> $$0, btl $$1, dcu $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cuo $$0) {
      this.ar().a(b, $$0.c(1));
   }

   protected abstract cuj t();

   @Override
   public cuo p() {
      return this.ar().a(b);
   }

   @Override
   protected void a(ajz.a $$0) {
      $$0.a(b, new cuo(this.t()));
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
         this.a(cuo.a(this.dS(), (ux)$$0.p("Item")).orElseGet(() -> new cuo(this.t())));
      } else {
         this.a(new cuo(this.t()));
      }
   }
}
