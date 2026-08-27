public class boj extends bnq {
   private static final String b = "data";
   private sw c = new sw();

   public boj(bnw<?> $$0, cvr $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void c_() {
   }

   @Override
   protected void a(sw $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(sw $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public xx<aag> di() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean q(bnq $$0) {
      return false;
   }

   @Override
   protected boolean bD() {
      return false;
   }

   @Override
   protected void o(bnq $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ehb s_() {
      return ehb.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
