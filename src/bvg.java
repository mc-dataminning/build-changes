public class bvg extends buj {
   private static final String a = "data";
   private tq b = new tq();

   public bvg(buq<?> $$0, dgg $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public void h() {
   }

   @Override
   protected void a(akb.a $$0) {
   }

   @Override
   protected void a(tq $$0) {
      this.b = $$0.p("data");
   }

   @Override
   protected void b(tq $$0) {
      $$0.a("data", this.b.i());
   }

   @Override
   public yv<abk> a(ara $$0) {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(buj $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(buj $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public etc n_() {
      return etc.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public final boolean a(arc $$0, bsz $$1, float $$2) {
      return false;
   }
}
