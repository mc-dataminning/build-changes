public class bvy extends bvb {
   private static final String a = "data";
   private um b = new um();

   public bvy(bvi<?> $$0, dgz $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public void h() {
   }

   @Override
   protected void a(akw.a $$0) {
   }

   @Override
   protected void a(um $$0) {
      this.b = $$0.p("data");
   }

   @Override
   protected void b(um $$0) {
      $$0.a("data", this.b.i());
   }

   @Override
   public zr<acg> a(arv $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bvb $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(bvb $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public etv n_() {
      return etv.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public final boolean a(arx $$0, btr $$1, float $$2) {
      return false;
   }
}
