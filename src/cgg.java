public abstract class cgg extends cgh implements cfx {
   private static final agm<cmy> b = agp.a(cgg.class, ago.h);

   public cgg(blz<? extends cgg> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public cgg(blz<? extends cgg> $$0, double $$1, double $$2, double $$3, ctp $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cgg(blz<? extends cgg> $$0, bml $$1, ctp $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cmy $$0) {
      if (!$$0.a(this.s()) || $$0.u()) {
         this.an().b(b, $$0.c(1));
      }
   }

   protected abstract cmt s();

   protected cmy u() {
      return this.an().b(b);
   }

   @Override
   public cmy q() {
      cmy $$0 = this.u();
      return $$0.b() ? new cmy(this.s()) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(b, cmy.f);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      cmy $$1 = this.u();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new sn()));
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      cmy $$1 = cmy.a($$0.p("Item"));
      this.a($$1);
   }
}
