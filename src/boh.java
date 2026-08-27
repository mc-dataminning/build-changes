public class boh extends bno {
   private static final String b = "data";
   private sw c = new sw();

   public boh(bnu<?> $$0, cvn $$1) {
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
   protected boolean q(bno $$0) {
      return false;
   }

   @Override
   protected boolean bD() {
      return false;
   }

   @Override
   protected void o(bno $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public egu s_() {
      return egu.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
