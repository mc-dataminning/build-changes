public class btl extends bsp {
   private static final String b = "data";
   private ur c = new ur();

   public btl(bsv<?> $$0, dbt $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   protected void a(ur $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(ur $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public zs<ace> dl() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bsp $$0) {
      return false;
   }

   @Override
   protected boolean bJ() {
      return false;
   }

   @Override
   protected void p(bsp $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public env k_() {
      return env.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
