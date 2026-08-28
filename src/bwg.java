public class bwg extends bvj {
   private static final String a = "data";
   private ux b = new ux();

   public bwg(bvq<?> $$0, dhh $$1) {
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
   protected boolean r(bvj $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(bvj $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eub n_() {
      return eub.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public final boolean a(ash $$0, btz $$1, float $$2) {
      return false;
   }
}
