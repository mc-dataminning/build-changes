public class bsp extends bru {
   private static final String b = "data";
   private ud c = new ud();

   public bsp(bsa<?> $$0, dax $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(ajv.a $$0) {
   }

   @Override
   protected void a(ud $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(ud $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public ze<abq> dl() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bru $$0) {
      return false;
   }

   @Override
   protected boolean bJ() {
      return false;
   }

   @Override
   protected void p(bru $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public emz k_() {
      return emz.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
