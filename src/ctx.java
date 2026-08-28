public class ctx extends ctk {
   private final dhx b = new dhx() {
      @Override
      public void a(div $$0, iu $$1, int $$2) {
         $$0.a(ctx.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public ctx(bwm<? extends ctx> $$0, div $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cyu o() {
      return czc.os;
   }

   @Override
   public cyy dI() {
      return new cyy(czc.os);
   }

   private Runnable c(div $$0) {
      return $$0 instanceof arq ? () -> this.b.a((arq)$$0, this.dv()) : () -> this.b.a($$0, this.dv());
   }

   @Override
   public dzz v() {
      return dmc.cB.m();
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.b.a(this.dV(), this.dv(), $$0);
   }

   @Override
   protected void b(tz $$0) {
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

   public dhx q() {
      return this.b;
   }
}
