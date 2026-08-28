public class cux extends cuk {
   private final dix b = new dix() {
      @Override
      public void a(djx $$0, iv $$1, int $$2) {
         $$0.a(cux.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public cux(bxc<? extends cux> $$0, djx $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected czu o() {
      return dac.ov;
   }

   @Override
   public czy dI() {
      return new czy(dac.ov);
   }

   private Runnable c(djx $$0) {
      return $$0 instanceof ars ? () -> this.b.a((ars)$$0, this.dv()) : () -> this.b.a($$0, this.dv());
   }

   @Override
   public ebe v() {
      return dne.cD.m();
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

   public dix q() {
      return this.b;
   }
}
