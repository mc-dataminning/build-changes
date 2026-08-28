public class bvf extends bui {
   private static final String b = "data";
   private un c = new un();

   public bvf(bup<?> $$0, dff $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(aks.a $$0) {
   }

   @Override
   protected void a(un $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(un $$0) {
      $$0.a("data", this.c.i());
   }

   @Override
   public zs<ach> a(arp $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bui $$0) {
      return false;
   }

   @Override
   protected boolean bT() {
      return false;
   }

   @Override
   protected void p(bui $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ert k_() {
      return ert.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
