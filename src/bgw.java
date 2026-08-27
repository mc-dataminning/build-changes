public final class bgw implements bgr {
   private final te a;
   private final cfg b;

   public bgw(cfg $$0, te $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public te H_() {
      return this.a;
   }

   @Override
   public cec createMenu(int $$0, cbk $$1, cbl $$2) {
      return this.b.createMenu($$0, $$1, $$2);
   }
}
