public class blw extends blf {
   private static final String b = "data";
   private sj c = new sj();

   public blw(blj<?> $$0, csy $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   public void l() {
   }

   @Override
   protected void c_() {
   }

   @Override
   protected void a(sj $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(sj $$0) {
      $$0.a("data", this.c.h());
   }

   @Override
   public wu<yo> dj() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected boolean r(blf $$0) {
      return false;
   }

   @Override
   protected boolean bD() {
      return false;
   }

   @Override
   protected void p(blf $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eee s_() {
      return eee.d;
   }

   @Override
   public boolean r_() {
      return true;
   }
}
