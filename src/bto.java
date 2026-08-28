public class bto extends bss {
   private static final String b = "data";
   private ur c = new ur();

   public bto(bsy<?> $$0, dbw $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(akn.a $$0) {
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
   public zv<ach> dl() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bss $$0) {
      return false;
   }

   @Override
   protected boolean bJ() {
      return false;
   }

   @Override
   protected void p(bss $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eny k_() {
      return eny.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
