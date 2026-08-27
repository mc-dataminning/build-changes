public class boy extends bof {
   private static final String b = "data";
   private sy c = new sy();

   public boy(bol<?> $$0, cwe $$1) {
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
   protected void a(sy $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(sy $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public xz<aai> df() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean q(bof $$0) {
      return false;
   }

   @Override
   protected boolean bD() {
      return false;
   }

   @Override
   protected void o(bof $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ehw s_() {
      return ehw.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
