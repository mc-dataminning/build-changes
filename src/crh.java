public class crh extends cqu {
   private final dfh b = new dfh() {
      @Override
      public void a(dgg $$0, ji $$1, int $$2) {
         $$0.a(crh.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public crh(buq<? extends crh> $$0, dgg $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cwj u() {
      return cwr.oo;
   }

   @Override
   public cwn dJ() {
      return new cwn(cwr.oo);
   }

   private Runnable c(dgg $$0) {
      return $$0 instanceof arc ? () -> this.b.a((arc)$$0, this.dw()) : () -> this.b.a($$0, this.dw());
   }

   @Override
   public dwv w() {
      return djm.cA.m();
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.b.a(this.dW(), this.dw(), $$0);
   }

   @Override
   protected void b(tq $$0) {
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

   public dfh v() {
      return this.b;
   }

   @Override
   public boolean cW() {
      return true;
   }
}
