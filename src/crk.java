public class crk extends cqx {
   private final dfk b = new dfk() {
      @Override
      public void a(dgj $$0, ji $$1, int $$2) {
         $$0.a(crk.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public crk(but<? extends crk> $$0, dgj $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cwm u() {
      return cwu.oo;
   }

   @Override
   public cwq dI() {
      return new cwq(cwu.oo);
   }

   private Runnable c(dgj $$0) {
      return $$0 instanceof ard ? () -> this.b.a((ard)$$0, this.dv()) : () -> this.b.a($$0, this.dv());
   }

   @Override
   public dwy w() {
      return djp.cA.m();
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

   public dfk v() {
      return this.b;
   }
}
