public class cum extends ctz {
   private final dim b = new dim() {
      @Override
      public void a(djm $$0, iv $$1, int $$2) {
         $$0.a(cum.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public cum(bwr<? extends cum> $$0, djm $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected czj o() {
      return czr.ov;
   }

   @Override
   public czn dH() {
      return new czn(czr.ov);
   }

   private Runnable c(djm $$0) {
      return $$0 instanceof arq ? () -> this.b.a((arq)$$0, this.du()) : () -> this.b.a($$0, this.du());
   }

   @Override
   public eat v() {
      return dmt.cD.m();
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

   public dim q() {
      return this.b;
   }
}
