public class bug extends btj {
   private static final String b = "data";
   private uf c = new uf();

   public bug(btq<?> $$0, dds $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   protected void a(uf $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(uf $$0) {
      $$0.a("data", this.c.i());
   }

   @Override
   public zk<abz> a(arf $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(btj $$0) {
      return false;
   }

   @Override
   protected boolean bO() {
      return false;
   }

   @Override
   protected void p(btj $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eqg j_() {
      return eqg.d;
   }

   @Override
   public boolean q_() {
      return true;
   }
}
