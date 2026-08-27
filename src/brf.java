public class brf extends bql {
   private static final String b = "data";
   private ty c = new ty();

   public brf(bqr<?> $$0, czu $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(ajo.a $$0) {
   }

   @Override
   protected void a(ty $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(ty $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public yz<abk> dj() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bql $$0) {
      return false;
   }

   @Override
   protected boolean bH() {
      return false;
   }

   @Override
   protected void p(bql $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public elw k_() {
      return elw.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
