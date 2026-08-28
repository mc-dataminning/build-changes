public class bwh extends bvk {
   private static final String a = "data";
   private ux b = new ux();

   public bwh(bvr<?> $$0, dhi $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public void h() {
   }

   @Override
   protected void a(alg.a $$0) {
   }

   @Override
   protected void a(ux $$0) {
      this.b = $$0.p("data");
   }

   @Override
   protected void b(ux $$0) {
      $$0.a("data", this.b.i());
   }

   @Override
   public aac<acr> a(asf $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bvk $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(bvk $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public euc n_() {
      return euc.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public final boolean a(ash $$0, bua $$1, float $$2) {
      return false;
   }
}
