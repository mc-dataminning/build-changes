public class bqu extends bqa {
   private static final String b = "data";
   private to c = new to();

   public bqu(bqg<?> $$0, czg $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(aje.a $$0) {
   }

   @Override
   protected void a(to $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(to $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public yp<aba> di() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bqa $$0) {
      return false;
   }

   @Override
   protected boolean bG() {
      return false;
   }

   @Override
   protected void p(bqa $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public elg k_() {
      return elg.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
