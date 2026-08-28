public class btm extends bsq {
   private static final String b = "data";
   private ua c = new ua();

   public btm(bsw<?> $$0, dcu $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(ajz.a $$0) {
   }

   @Override
   protected void a(ua $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("data", this.c.i());
   }

   @Override
   public zf<abt> dm() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bsq $$0) {
      return false;
   }

   @Override
   protected boolean bK() {
      return false;
   }

   @Override
   protected void p(bsq $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public epd j_() {
      return epd.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
