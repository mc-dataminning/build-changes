public class cdw extends cdl {
   private final cox c = new cox() {
      @Override
      public void a(cpv $$0, gw $$1, int $$2) {
         $$0.a(cdw.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cdw(biu<? extends cdw> $$0, cpv $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cdw(cpv $$0, double $$1, double $$2, double $$3) {
      super(biu.aQ, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cja q() {
      return cji.na;
   }

   private Runnable b(cpv $$0) {
      return $$0 instanceof akr ? () -> this.c.a((akr)$$0, this.dl()) : () -> this.c.a($$0, this.dl());
   }

   @Override
   public cdl.a z() {
      return cdl.a.e;
   }

   @Override
   public dfj B() {
      return csw.ct.n();
   }

   @Override
   protected void a(qx $$0) {
      super.a($$0);
      this.c.a(this.dL(), this.dl(), $$0);
   }

   @Override
   protected void b(qx $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dL(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public cox G() {
      return this.c;
   }

   @Override
   public boolean cN() {
      return true;
   }
}
