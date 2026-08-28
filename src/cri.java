public class cri extends cqv {
   private final dfi b = new dfi() {
      @Override
      public void a(dgh $$0, ji $$1, int $$2) {
         $$0.a(cri.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public cri(bur<? extends cri> $$0, dgh $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cwk u() {
      return cws.oo;
   }

   @Override
   public cwo dI() {
      return new cwo(cws.oo);
   }

   private Runnable c(dgh $$0) {
      return $$0 instanceof ard ? () -> this.b.a((ard)$$0, this.dv()) : () -> this.b.a($$0, this.dv());
   }

   @Override
   public dww w() {
      return djn.cA.m();
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.b.a(this.dV(), this.dv(), $$0);
   }

   @Override
   protected void b(tq $$0) {
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

   public dfi v() {
      return this.b;
   }
}
