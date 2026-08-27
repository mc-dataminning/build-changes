public abstract class cht extends cho implements chw {
   private static final aie<coz> e = aih.a(cht.class, aig.h);

   public cht(bnu<? extends cht> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cht(bnu<? extends cht> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cvn $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cht(bnu<? extends cht> $$0, bog $$1, double $$2, double $$3, double $$4, cvn $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(coz $$0) {
      if (!$$0.a(cpc.tV) || $$0.v()) {
         this.an().b(e, $$0.c(1));
      }
   }

   protected coz z() {
      return this.an().b(e);
   }

   @Override
   public coz q() {
      coz $$0 = this.z();
      return $$0.b() ? new coz(cpc.tV) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(e, coz.h);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      coz $$1 = this.z();
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
