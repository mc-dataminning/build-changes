public class bmm extends blv {
   private static final String b = "data";
   private sn c = new sn();

   public bmm(blz<?> $$0, ctp $$1) {
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
   protected void a(sn $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(sn $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public xf<za> dj() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(blv $$0) {
      return false;
   }

   @Override
   protected boolean bD() {
      return false;
   }

   @Override
   protected void p(blv $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eew s_() {
      return eew.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
