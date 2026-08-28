public class csa extends crn {
   private final dga b = new dga() {
      @Override
      public void a(dgz $$0, jh $$1, int $$2) {
         $$0.a(csa.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public csa(bvi<? extends csa> $$0, dgz $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cxc u() {
      return cxk.oo;
   }

   @Override
   public cxg dJ() {
      return new cxg(cxk.oo);
   }

   private Runnable c(dgz $$0) {
      return $$0 instanceof arx ? () -> this.b.a((arx)$$0, this.dw()) : () -> this.b.a($$0, this.dw());
   }

   @Override
   public dxo w() {
      return dkf.cA.m();
   }

   @Override
   protected void a(um $$0) {
      super.a($$0);
      this.b.a(this.dW(), this.dw(), $$0);
   }

   @Override
   protected void b(um $$0) {
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

   public dga v() {
      return this.b;
   }

   @Override
   public boolean cW() {
      return true;
   }
}
