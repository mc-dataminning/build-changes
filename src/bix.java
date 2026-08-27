public class bix extends big {
   private static final String b = "data";
   private qs c = new qs();

   public bix(bik<?> $$0, cpk $$1) {
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
   protected void a(qs $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(qs $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public uw<wo> U() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(big $$0) {
      return false;
   }

   @Override
   protected boolean bC() {
      return false;
   }

   @Override
   protected void p(big $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eag l_() {
      return eag.d;
   }

   @Override
   public boolean d_() {
      return true;
   }
}
