public class bkk extends bjt {
   private static final String b = "data";
   private rt c = new rt();

   public bkk(bjx<?> $$0, cqz $$1) {
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
   protected void a(rt $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(rt $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public wb<xu> di() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bjt $$0) {
      return false;
   }

   @Override
   protected boolean bC() {
      return false;
   }

   @Override
   protected void p(bjt $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ebj r_() {
      return ebj.d;
   }

   @Override
   public boolean q_() {
      return true;
   }
}
