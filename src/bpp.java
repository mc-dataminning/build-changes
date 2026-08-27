public class bpp extends bow {
   private static final String b = "data";
   private ta c = new ta();

   public bpp(bpc<?> $$0, cwz $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void a(aiq.a $$0) {
   }

   @Override
   protected void a(ta $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(ta $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public yb<aam> di() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(bow $$0) {
      return false;
   }

   @Override
   protected boolean bG() {
      return false;
   }

   @Override
   protected void p(bow $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eis r_() {
      return eis.d;
   }

   @Override
   public boolean q_() {
      return true;
   }
}
