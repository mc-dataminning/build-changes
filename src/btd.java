public class btd extends bsh {
   private static final String b = "data";
   private tx c = new tx();

   public btd(bsn<?> $$0, dcg $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Override
   protected void a(tx $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("data", this.c.i());
   }

   @Override
   public zb<abn> dn() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bsh $$0) {
      return false;
   }

   @Override
   protected boolean bL() {
      return false;
   }

   @Override
   protected void p(bsh $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eoo j_() {
      return eoo.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
