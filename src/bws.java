public class bws extends bvs {
   private static final String a = "data";
   private tw b = new tw();

   public bws(bwb<?> $$0, dhp $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public void h() {
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   protected void a(tw $$0) {
      this.b = $$0.p("data");
   }

   @Override
   protected void b(tw $$0) {
      $$0.a("data", this.b.i());
   }

   @Override
   public zc<abr> a(arl $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bvs $$0) {
      return false;
   }

   @Override
   protected boolean bQ() {
      return false;
   }

   @Override
   protected void p(bvs $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public euy j_() {
      return euy.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public final boolean a(arn $$0, buh $$1, float $$2) {
      return false;
   }
}
