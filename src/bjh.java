public class bjh extends biq {
   private static final String b = "data";
   private qw c = new qw();

   public bjh(biu<?> $$0, cpv $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a_() {
   }

   @Override
   protected void a(qw $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(qw $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public vd<ww> di() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(biq $$0) {
      return false;
   }

   @Override
   protected boolean bC() {
      return false;
   }

   @Override
   protected void p(biq $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ear q_() {
      return ear.d;
   }

   @Override
   public boolean p_() {
      return true;
   }
}
