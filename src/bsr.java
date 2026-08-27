public class bsr extends brw {
   private static final String b = "data";
   private ud c = new ud();

   public bsr(bsc<?> $$0, daz $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(ajw.a $$0) {
   }

   @Override
   protected void a(ud $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(ud $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public ze<abq> dl() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(brw $$0) {
      return false;
   }

   @Override
   protected boolean bJ() {
      return false;
   }

   @Override
   protected void p(brw $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public enb k_() {
      return enb.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
