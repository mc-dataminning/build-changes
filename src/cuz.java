public class cuz extends cum {
   private final diz b = new diz() {
      @Override
      public void a(djz $$0, iw $$1, int $$2) {
         $$0.a(cuz.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public cuz(bxe<? extends cuz> $$0, djz $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected czw o() {
      return dae.ov;
   }

   @Override
   public daa dI() {
      return new daa(dae.ov);
   }

   private Runnable c(djz $$0) {
      return $$0 instanceof aru ? () -> this.b.a((aru)$$0, this.dv()) : () -> this.b.a($$0, this.dv());
   }

   @Override
   public ebg v() {
      return dng.cD.m();
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.b.a(this.dV(), this.dv(), $$0);
   }

   @Override
   protected void b(ua $$0) {
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

   public diz q() {
      return this.b;
   }
}
