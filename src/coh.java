public class coh extends cnw {
   private final dbc c = new dbc() {
      @Override
      public void a(dca $$0, ir $$1, int $$2) {
         $$0.a(coh.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public coh(bsb<? extends coh> $$0, dca $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public coh(dca $$0, double $$1, double $$2, double $$3) {
      super(bsb.aX, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cuc ah_() {
      return cuk.pc;
   }

   private Runnable b(dca $$0) {
      return $$0 instanceof aqt ? () -> this.c.a((aqt)$$0, this.du()) : () -> this.c.a($$0, this.du());
   }

   @Override
   public cnw.a u() {
      return cnw.a.e;
   }

   @Override
   public dtc x() {
      return dfe.de.n();
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      this.c.a(this.dU(), this.du(), $$0);
   }

   @Override
   protected void b(uk $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dU(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public dbc B() {
      return this.c;
   }

   @Override
   public boolean cU() {
      return true;
   }
}
