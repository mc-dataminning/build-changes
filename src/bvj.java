public class bvj extends bum {
   private static final String a = "data";
   private tq b = new tq();

   public bvj(but<?> $$0, dgj $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public void h() {
   }

   @Override
   protected void a(akc.a $$0) {
   }

   @Override
   protected void a(tq $$0) {
      this.b = $$0.p("data");
   }

   @Override
   protected void b(tq $$0) {
      $$0.a("data", this.b.i());
   }

   @Override
   public yw<abl> a(arb $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bum $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(bum $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public etf n_() {
      return etf.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public final boolean a(ard $$0, btc $$1, float $$2) {
      return false;
   }
}
