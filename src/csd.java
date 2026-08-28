public class csd extends crq {
   private final dgb b = new dgb() {
      @Override
      public void a(dgz $$0, ji $$1, int $$2) {
         $$0.a(csd.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public csd(bvi<? extends csd> $$0, dgz $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cxd o() {
      return cxl.oq;
   }

   @Override
   public cxh dH() {
      return new cxh(cxl.oq);
   }

   private Runnable c(dgz $$0) {
      return $$0 instanceof ard ? () -> this.b.a((ard)$$0, this.du()) : () -> this.b.a($$0, this.du());
   }

   @Override
   public dxq v() {
      return dkg.cA.m();
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.b.a(this.dU(), this.du(), $$0);
   }

   @Override
   protected void b(tq $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.b.a(this.dU(), $$0);
   }

   @Override
   public void h() {
      super.h();
      this.c.run();
   }

   public dgb q() {
      return this.b;
   }
}
