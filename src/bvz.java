public class bvz extends bva {
   private static final String a = "data";
   private tq b = new tq();

   public bvz(bvi<?> $$0, dgz $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public void h() {
   }

   @Override
   protected void a(akb.a $$0) {
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
   protected boolean r(bva $$0) {
      return false;
   }

   @Override
   protected boolean bP() {
      return false;
   }

   @Override
   protected void p(bva $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eub j_() {
      return eub.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public final boolean a(ard $$0, btp $$1, float $$2) {
      return false;
   }
}
