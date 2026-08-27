public class cdr extends cdg {
   private final cos c = new cos() {
      @Override
      public void a(cpq $$0, gw $$1, int $$2) {
         $$0.a(cdr.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cdr(bip<? extends cdr> $$0, cpq $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cdr(cpq $$0, double $$1, double $$2, double $$3) {
      super(bip.aQ, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected civ j() {
      return cjd.na;
   }

   private Runnable b(cpq $$0) {
      return $$0 instanceof akn ? () -> this.c.a((akn)$$0, this.dk()) : () -> this.c.a($$0, this.dk());
   }

   @Override
   public cdg.a t() {
      return cdg.a.e;
   }

   @Override
   public dfe w() {
      return csr.ct.n();
   }

   @Override
   protected void a(qu $$0) {
      super.a($$0);
      this.c.a(this.dK(), this.dk(), $$0);
   }

   @Override
   protected void b(qu $$0) {
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

   public cos A() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
