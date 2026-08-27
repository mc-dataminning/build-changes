public class cdp extends cde {
   private final coo c = new coo() {
      @Override
      public void a(cpm $$0, gu $$1, int $$2) {
         $$0.a(cdp.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cdp(bim<? extends cdp> $$0, cpm $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cdp(cpm $$0, double $$1, double $$2, double $$3) {
      super(bim.aQ, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cit j() {
      return cjb.na;
   }

   private Runnable b(cpm $$0) {
      return $$0 instanceof akk ? () -> this.c.a((akk)$$0, this.dk()) : () -> this.c.a($$0, this.dk());
   }

   @Override
   public cde.a t() {
      return cde.a.e;
   }

   @Override
   public dfa w() {
      return csn.ct.n();
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

   public coo A() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
