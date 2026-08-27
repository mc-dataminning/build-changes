public class bga extends bfj {
   private static final String b = "data";
   private qr c = new qr();

   public bga(bfn<?> $$0, cmm $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a_() {
   }

   @Override
   protected void a(qr $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(qr $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public uo<ur> S() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean o(bfj $$0) {
      return false;
   }

   @Override
   protected boolean bB() {
      return false;
   }

   @Override
   protected void m(bfj $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public dxj l_() {
      return dxj.d;
   }

   @Override
   public boolean c_() {
      return true;
   }
}
