public class buw extends btz {
   private static final String b = "data";
   private uj c = new uj();

   public buw(bug<?> $$0, dev $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(ako.a $$0) {
   }

   @Override
   protected void a(uj $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(uj $$0) {
      $$0.a("data", this.c.i());
   }

   @Override
   public zo<acd> a(arl $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(btz $$0) {
      return false;
   }

   @Override
   protected boolean bS() {
      return false;
   }

   @Override
   protected void p(btz $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public erj k_() {
      return erj.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
