public class bqp extends bpv {
   private static final String b = "data";
   private tm c = new tm();

   public bqp(bqb<?> $$0, cyx $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(ajc.a $$0) {
   }

   @Override
   protected void a(tm $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(tm $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public yn<aay> di() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bpv $$0) {
      return false;
   }

   @Override
   protected boolean bG() {
      return false;
   }

   @Override
   protected void p(bpv $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ekx k_() {
      return ekx.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
