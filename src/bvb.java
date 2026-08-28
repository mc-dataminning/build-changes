public class bvb extends bue {
   private static final String b = "data";
   private uk c = new uk();

   public bvb(bul<?> $$0, dfb $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(akp.a $$0) {
   }

   @Override
   protected void a(uk $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(uk $$0) {
      $$0.a("data", this.c.i());
   }

   @Override
   public zp<ace> a(arm $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bue $$0) {
      return false;
   }

   @Override
   protected boolean bS() {
      return false;
   }

   @Override
   protected void p(bue $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public erp k_() {
      return erp.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
