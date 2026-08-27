public abstract class clk extends cll implements cla {
   private static final ajk<csd> b = ajo.a(clk.class, ajm.h);

   public clk(bqr<? extends clk> $$0, czu $$1) {
      super($$0, $$1);
   }

   public clk(bqr<? extends clk> $$0, double $$1, double $$2, double $$3, czu $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public clk(bqr<? extends clk> $$0, bre $$1, czu $$2) {
      super($$0, $$1, $$2);
   }

   public void a(csd $$0) {
      this.an().a(b, $$0.c(1));
   }

   protected abstract cry r();

   @Override
   public csd p() {
      return this.an().a(b);
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(b, new csd(this.r()));
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
         this.a(csd.a(this.dP(), (uv)$$0.p("Item")).orElseGet(() -> new csd(this.r())));
      } else {
         this.a(new csd(this.r()));
      }
   }
}
