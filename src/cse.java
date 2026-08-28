public class cse extends crr {
   private final dgb b = new dgb() {
      @Override
      public void a(dha $$0, jh $$1, int $$2) {
         $$0.a(cse.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public cse(bvm<? extends cse> $$0, dha $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cxg u() {
      return cxo.of;
   }

   @Override
   public cxk dI() {
      return new cxk(cxo.of);
   }

   private Runnable c(dha $$0) {
      return $$0 instanceof ash ? () -> this.b.a((ash)$$0, this.dv()) : () -> this.b.a($$0, this.dv());
   }

   @Override
   public dxn w() {
      return dkg.cA.m();
   }

   @Override
   protected void a(ux $$0) {
      super.a($$0);
      this.b.a(this.dV(), this.dv(), $$0);
   }

   @Override
   protected void b(ux $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.b.a(this.dV(), $$0);
   }

   @Override
   public void h() {
      super.h();
      this.c.run();
   }

   public dgb v() {
      return this.b;
   }

   @Override
   public boolean cW() {
      return true;
   }
}
