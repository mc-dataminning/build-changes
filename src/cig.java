public abstract class cig extends cih implements chw {
   private static final aie<coz> b = aih.a(cig.class, aig.h);

   public cig(bnu<? extends cig> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cig(bnu<? extends cig> $$0, double $$1, double $$2, double $$3, cvn $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cig(bnu<? extends cig> $$0, bog $$1, cvn $$2) {
      super($$0, $$1, $$2);
   }

   public void a(coz $$0) {
      if (!$$0.a(this.s()) || $$0.v()) {
         this.an().b(b, $$0.c(1));
      }
   }

   protected abstract cou s();

   protected coz u() {
      return this.an().b(b);
   }

   @Override
   public coz q() {
      coz $$0 = this.u();
      return $$0.b() ? new coz(this.s()) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(b, coz.h);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      coz $$1 = this.u();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new sw()));
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      coz $$1 = coz.a($$0.p("Item"));
      this.a($$1);
   }
}
