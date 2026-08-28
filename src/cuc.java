public class cuc extends ctp {
   private final dic b = new dic() {
      @Override
      public void a(dja $$0, iu $$1, int $$2) {
         $$0.a(cuc.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public cuc(bwo<? extends cuc> $$0, dja $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cyz o() {
      return czh.ov;
   }

   @Override
   public czd dI() {
      return new czd(czh.ov);
   }

   private Runnable c(dja $$0) {
      return $$0 instanceof arq ? () -> this.b.a((arq)$$0, this.dv()) : () -> this.b.a($$0, this.dv());
   }

   @Override
   public eah v() {
      return dmh.cD.m();
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

   public dic q() {
      return this.b;
   }
}
