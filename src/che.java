public class che extends cgt {
   private final csk c = new csk() {
      @Override
      public void a(cti $$0, hx $$1, int $$2) {
         $$0.a(che.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public che(blt<? extends che> $$0, cti $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public che(cti $$0, double $$1, double $$2, double $$3) {
      super(blt.aR, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cmm ah_() {
      return cmu.nL;
   }

   private Runnable b(cti $$0) {
      return $$0 instanceof amz ? () -> this.c.a((amz)$$0, this.dm()) : () -> this.c.a($$0, this.dm());
   }

   @Override
   public cgt.a w() {
      return cgt.a.e;
   }

   @Override
   public dja y() {
      return cwl.ct.o();
   }

   @Override
   protected void a(sl $$0) {
      super.a($$0);
      this.c.a(this.dM(), this.dm(), $$0);
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dM(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public csk C() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
