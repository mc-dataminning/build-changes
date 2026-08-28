public class csi extends crv {
   private final dgi b = new dgi() {
      @Override
      public void a(dhh $$0, jh $$1, int $$2) {
         $$0.a(csi.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public csi(bvq<? extends csi> $$0, dhh $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cxk u() {
      return cxs.of;
   }

   @Override
   public cxo dJ() {
      return new cxo(cxs.of);
   }

   private Runnable c(dhh $$0) {
      return $$0 instanceof ash ? () -> this.b.a((ash)$$0, this.dw()) : () -> this.b.a($$0, this.dw());
   }

   @Override
   public dxu w() {
      return dkn.cA.m();
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

   public dgi v() {
      return this.b;
   }

   @Override
   public boolean cW() {
      return true;
   }
}
