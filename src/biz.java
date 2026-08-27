public class biz extends bii {
   private static final String b = "data";
   private qr c = new qr();

   public biz(bim<?> $$0, cpl $$1) {
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
   protected void a(qr $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(qr $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public ux<wp> U() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bii $$0) {
      return false;
   }

   @Override
   protected boolean bC() {
      return false;
   }

   @Override
   protected void p(bii $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eah l_() {
      return eah.d;
   }

   @Override
   public boolean d_() {
      return true;
   }
}
