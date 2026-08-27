public class bmg extends blp {
   private static final String b = "data";
   private sl c = new sl();

   public bmg(blt<?> $$0, cti $$1) {
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
   protected void a(sl $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(sl $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public xd<yx> dj() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(blp $$0) {
      return false;
   }

   @Override
   protected boolean bD() {
      return false;
   }

   @Override
   protected void p(blp $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eep s_() {
      return eep.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
