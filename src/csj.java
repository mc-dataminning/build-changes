public class csj extends crw {
   private final dgj b = new dgj() {
      @Override
      public void a(dhi $$0, jh $$1, int $$2) {
         $$0.a(csj.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public csj(bvr<? extends csj> $$0, dhi $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cxl u() {
      return cxt.of;
   }

   @Override
   public cxp dJ() {
      return new cxp(cxt.of);
   }

   private Runnable c(dhi $$0) {
      return $$0 instanceof ash ? () -> this.b.a((ash)$$0, this.dw()) : () -> this.b.a($$0, this.dw());
   }

   @Override
   public dxv w() {
      return dko.cA.m();
   }

   @Override
   protected void a(ux $$0) {
      super.a($$0);
      this.b.a(this.dW(), this.dw(), $$0);
   }

   @Override
   protected void b(ux $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.b.a(this.dW(), $$0);
   }

   @Override
   public void h() {
      super.h();
      this.c.run();
   }

   public dgj v() {
      return this.b;
   }

   @Override
   public boolean cW() {
      return true;
   }
}
