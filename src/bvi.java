public class bvi extends bul {
   private static final String a = "data";
   private ul b = new ul();

   public bvi(bus<?> $$0, dfm $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public void h() {
   }

   @Override
   protected void a(akq.a $$0) {
   }

   @Override
   protected void a(ul $$0) {
      this.b = $$0.p("data");
   }

   @Override
   protected void b(ul $$0) {
      $$0.a("data", this.b.i());
   }

   @Override
   public zq<acf> a(arn $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bul $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(bul $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public esa m_() {
      return esa.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public final boolean a(arp $$0, btb $$1, float $$2) {
      return false;
   }
}
