public class bvh extends buk {
   private static final String a = "data";
   private tq b = new tq();

   public bvh(bur<?> $$0, dgh $$1) {
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
   protected boolean r(buk $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(buk $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public etd n_() {
      return etd.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public final boolean a(ard $$0, bta $$1, float $$2) {
      return false;
   }
}
