public class bsp extends brv {
   private static final String b = "data";
   private uk c = new uk();

   public bsp(bsb<?> $$0, dca $$1) {
      super($$0, $$1);
      this.ah = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(akc.a $$0) {
   }

   @Override
   protected void a(uk $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(uk $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public zl<abw> dq() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(brv $$0) {
      return false;
   }

   @Override
   protected boolean bO() {
      return false;
   }

   @Override
   protected void p(brv $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public epj j_() {
      return epj.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
