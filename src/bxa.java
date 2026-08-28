public class bxa extends bwa {
   private static final String a = "data";
   private tx b = new tx();

   public bxa(bwj<?> $$0, dip $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public void h() {
   }

   @Override
   protected void a(akl.a $$0) {
   }

   @Override
   protected void a(tx $$0) {
      this.b = $$0.p("data");
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("data", this.b.i());
   }

   @Override
   public zd<abs> a(arm $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bwa $$0) {
      return false;
   }

   @Override
   protected boolean bQ() {
      return false;
   }

   @Override
   protected void p(bwa $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ewa j_() {
      return ewa.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public final boolean a(aro $$0, bup $$1, float $$2) {
      return false;
   }
}
