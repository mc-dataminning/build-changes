public class cuj extends ctw {
   private final dij b = new dij() {
      @Override
      public void a(djh $$0, iv $$1, int $$2) {
         $$0.a(cuj.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public cuj(bwr<? extends cuj> $$0, djh $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected czg o() {
      return czo.ov;
   }

   @Override
   public czk dH() {
      return new czk(czo.ov);
   }

   private Runnable c(djh $$0) {
      return $$0 instanceof arq ? () -> this.b.a((arq)$$0, this.du()) : () -> this.b.a($$0, this.du());
   }

   @Override
   public eao v() {
      return dmo.cD.m();
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.b.a(this.dU(), this.du(), $$0);
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.b.a(this.dU(), $$0);
   }

   @Override
   public void h() {
      super.h();
      this.c.run();
   }

   public dij q() {
      return this.b;
   }
}
