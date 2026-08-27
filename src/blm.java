public class blm extends bkv {
   private static final String b = "data";
   private sd c = new sd();

   public blm(bkz<?> $$0, csf $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void c_() {
   }

   @Override
   protected void a(sd $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(sd $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public wo<yh> dk() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bkv $$0) {
      return false;
   }

   @Override
   protected boolean bD() {
      return false;
   }

   @Override
   protected void p(bkv $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public edc s_() {
      return edc.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
