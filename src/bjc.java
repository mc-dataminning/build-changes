public class bjc extends bil {
   private static final String b = "data";
   private qu c = new qu();

   public bjc(bip<?> $$0, cpq $$1) {
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
   protected void a(qu $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(qu $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public va<ws> U() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bil $$0) {
      return false;
   }

   @Override
   protected boolean bC() {
      return false;
   }

   @Override
   protected void p(bil $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eam l_() {
      return eam.d;
   }

   @Override
   public boolean d_() {
      return true;
   }
}
