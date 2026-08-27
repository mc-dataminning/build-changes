public class bmp extends blw {
   private static final String b = "data";
   private so c = new so();

   public bmp(bmc<?> $$0, ctx $$1) {
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
   protected void a(so $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(so $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public xg<zb> di() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean q(blw $$0) {
      return false;
   }

   @Override
   protected boolean bD() {
      return false;
   }

   @Override
   protected void o(blw $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public efe s_() {
      return efe.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
