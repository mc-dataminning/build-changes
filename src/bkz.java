public class bkz extends bki {
   private static final String b = "data";
   private rz c = new rz();

   public bkz(bkm<?> $$0, crs $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void b_() {
   }

   @Override
   protected void a(rz $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(rz $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public wk<yd> di() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bki $$0) {
      return false;
   }

   @Override
   protected boolean bC() {
      return false;
   }

   @Override
   protected void p(bki $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ecl r_() {
      return ecl.d;
   }

   @Override
   public boolean q_() {
      return true;
   }
}
