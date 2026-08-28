public class bxd extends bwd {
   private static final String a = "data";
   private tz b = new tz();

   public bxd(bwm<?> $$0, div $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public void h() {
   }

   @Override
   protected void a(akn.a $$0) {
   }

   @Override
   protected void a(tz $$0) {
      this.b = $$0.p("data");
   }

   @Override
   protected void b(tz $$0) {
      $$0.a("data", this.b.i());
   }

   @Override
   public zf<abu> a(aro $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bwd $$0) {
      return false;
   }

   @Override
   protected boolean bQ() {
      return false;
   }

   @Override
   protected void p(bwd $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ewl j_() {
      return ewl.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public final boolean a(arq $$0, bus $$1, float $$2) {
      return false;
   }
}
