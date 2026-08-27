public class bsb extends brh {
   private static final String b = "data";
   private ua c = new ua();

   public bsb(brn<?> $$0, dad $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(ajq.a $$0) {
   }

   @Override
   protected void a(ua $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public zb<abm> dj() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(brh $$0) {
      return false;
   }

   @Override
   protected boolean bH() {
      return false;
   }

   @Override
   protected void p(brh $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public emf k_() {
      return emf.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
