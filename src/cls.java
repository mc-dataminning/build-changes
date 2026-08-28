public class cls extends cmo {
   public cls(bup<? extends cls> $$0, dff $$1) {
      super($$0, $$1);
   }

   public static boolean a(bup<cls> $$0, dfw $$1, buo $$2, jh $$3, azv $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (buo.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ai_() {
      return false;
   }

   @Override
   protected awn w() {
      return awo.mY;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.nb;
   }

   @Override
   protected awn o_() {
      return awo.na;
   }

   @Override
   protected awn y() {
      return awo.nc;
   }

   @Override
   public boolean E(bui $$0) {
      boolean $$1 = super.E($$0);
      if ($$1 && this.fc().f() && $$0 instanceof bve) {
         float $$2 = this.dY().d_(this.dy()).b();
         ((bve)$$0).b(new btn(btp.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gw() {
      return true;
   }

   @Override
   protected void ah_() {
      this.b(bup.bu);
      if (!this.bd()) {
         this.dY().a(null, 1041, this.dy(), 0);
      }
   }

   @Override
   protected cwf gv() {
      return cwf.k;
   }
}
