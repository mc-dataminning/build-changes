public class bxk extends bwi {
   private static final String a = "data";
   private tz b = new tz();

   public bxk(bwr<?> $$0, djm $$1) {
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
      this.b = $$0.n("data");
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
   protected boolean r(bwi $$0) {
      return false;
   }

   @Override
   protected boolean bO() {
      return false;
   }

   @Override
   protected void p(bwi $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public exf j_() {
      return exf.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public final boolean a(arq $$0, bux $$1, float $$2) {
      return false;
   }
}
