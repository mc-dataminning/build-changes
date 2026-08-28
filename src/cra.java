public class cra extends cqo {
   private final deg c = new deg() {
      @Override
      public void a(dff $$0, jh $$1, int $$2) {
         $$0.a(cra.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cra(bup<? extends cra> $$0, dff $$1) {
      super($$0, $$1);
      this.d = this.c($$1);
   }

   @Override
   protected cwb al_() {
      return cwj.nM;
   }

   @Override
   public cwf dL() {
      return new cwf(cwj.nM);
   }

   private Runnable c(dff $$0) {
      return $$0 instanceof arq ? () -> this.c.a((arq)$$0, this.dy()) : () -> this.c.a($$0, this.dy());
   }

   @Override
   public dvo z() {
      return dil.ct.m();
   }

   @Override
   protected void a(un $$0) {
      super.a($$0);
      this.c.a(this.dY(), this.dy(), $$0);
   }

   @Override
   protected void b(un $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dY(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public deg F() {
      return this.c;
   }

   @Override
   public boolean cY() {
      return true;
   }
}
