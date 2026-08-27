public class cdo extends cdd {
   private final com c = new com() {
      @Override
      public void a(cpl $$0, gu $$1, int $$2) {
         $$0.a(cdo.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cdo(bim<? extends cdo> $$0, cpl $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cdo(cpl $$0, double $$1, double $$2, double $$3) {
      super(bim.aQ, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cis j() {
      return cja.na;
   }

   private Runnable b(cpl $$0) {
      return $$0 instanceof akk ? () -> this.c.a((akk)$$0, this.dk()) : () -> this.c.a($$0, this.dk());
   }

   @Override
   public cdd.a t() {
      return cdd.a.e;
   }

   @Override
   public dez w() {
      return csm.ct.n();
   }

   @Override
   protected void a(qr $$0) {
      super.a($$0);
      this.c.a(this.dK(), this.dk(), $$0);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dK(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public com A() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
