public class btr extends bsv {
   private static final String b = "data";
   private us c = new us();

   public btr(btb<?> $$0, dbz $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(ako.a $$0) {
   }

   @Override
   protected void a(us $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(us $$0) {
      $$0.a("data", this.c.i());
   }

   @Override
   public zw<aci> dl() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bsv $$0) {
      return false;
   }

   @Override
   protected boolean bJ() {
      return false;
   }

   @Override
   protected void p(bsv $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eob k_() {
      return eob.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
