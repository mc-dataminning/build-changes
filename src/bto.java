public class bto extends bsr {
   private static final String b = "data";
   private ub c = new ub();

   public bto(bsx<?> $$0, dcw $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(aka.a $$0) {
   }

   @Override
   protected void a(ub $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(ub $$0) {
      $$0.a("data", this.c.i());
   }

   @Override
   public zg<abu> a(aqt $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bsr $$0) {
      return false;
   }

   @Override
   protected boolean bK() {
      return false;
   }

   @Override
   protected void p(bsr $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eph j_() {
      return eph.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
