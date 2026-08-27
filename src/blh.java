public class blh extends bkq {
   private static final String b = "data";
   private rz c = new rz();

   public blh(bku<?> $$0, csa $$1) {
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
   public wk<yd> dk() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bkq $$0) {
      return false;
   }

   @Override
   protected boolean bD() {
      return false;
   }

   @Override
   protected void p(bkq $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ecx r_() {
      return ecx.d;
   }

   @Override
   public boolean q_() {
      return true;
   }
}
