public class bxv extends bwt {
   private static final String a = "data";
   private tz b = new tz();

   public bxv(bxc<?> $$0, djx $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public void h() {
   }

   @Override
   protected void a(akp.a $$0) {
   }

   @Override
   protected void a(tz $$0) {
      this.b = $$0.n("data");
   }

   @Override
   protected void b(tz $$0) {
      $$0.a("data", this.b.l());
   }

   @Override
   public zh<abw> a(arq $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bwt $$0) {
      return false;
   }

   @Override
   protected boolean bP() {
      return false;
   }

   @Override
   protected void p(bwt $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ext j_() {
      return ext.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public final boolean a(ars $$0, bvi $$1, float $$2) {
      return false;
   }
}
