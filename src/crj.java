public class crj extends cqw {
   private final dfj b = new dfj() {
      @Override
      public void a(dgi $$0, ji $$1, int $$2) {
         $$0.a(crj.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public crj(bus<? extends crj> $$0, dgi $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cwl u() {
      return cwt.oo;
   }

   @Override
   public cwp dI() {
      return new cwp(cwt.oo);
   }

   private Runnable c(dgi $$0) {
      return $$0 instanceof ard ? () -> this.b.a((ard)$$0, this.dv()) : () -> this.b.a($$0, this.dv());
   }

   @Override
   public dwx w() {
      return djo.cA.m();
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

   public dfj v() {
      return this.b;
   }
}
