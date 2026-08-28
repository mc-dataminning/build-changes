public class buo extends btr {
   private static final String b = "data";
   private ug c = new ug();

   public buo(bty<?> $$0, dej $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(akl.a $$0) {
   }

   @Override
   protected void a(ug $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(ug $$0) {
      $$0.a("data", this.c.i());
   }

   @Override
   public zl<aca> a(ari $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(btr $$0) {
      return false;
   }

   @Override
   protected boolean bO() {
      return false;
   }

   @Override
   protected void p(btr $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eqy k_() {
      return eqy.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
