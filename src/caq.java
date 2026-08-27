public class caq extends caf {
   private final clo c = new clo() {
      @Override
      public void a(cmm $$0, gu $$1, int $$2) {
         $$0.a(caq.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public caq(bfn<? extends caq> $$0, cmm $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public caq(cmm $$0, double $$1, double $$2, double $$3) {
      super(bfn.aQ, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cfu j() {
      return cgc.na;
   }

   private Runnable b(cmm $$0) {
      return $$0 instanceof aif ? () -> this.c.a((aif)$$0, this.di()) : () -> this.c.a($$0, this.di());
   }

   @Override
   public caf.a t() {
      return caf.a.e;
   }

   @Override
   public dcb w() {
      return cpo.ct.n();
   }

   @Override
   protected void a(qr $$0) {
      super.a($$0);
      this.c.a(this.dI(), this.di(), $$0);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dI(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public clo A() {
      return this.c;
   }

   @Override
   public boolean cK() {
      return true;
   }
}
