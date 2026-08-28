public class cpg extends cov {
   private final dbc c = new dbc() {
      @Override
      public void a(dca $$0, iz $$1, int $$2) {
         $$0.a(cpg.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cpg(btc<? extends cpg> $$0, dca $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cpg(dca $$0, double $$1, double $$2, double $$3) {
      super(btc.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cum ag_() {
      return cuu.nM;
   }

   private Runnable b(dca $$0) {
      return $$0 instanceof arf ? () -> this.c.a((arf)$$0, this.dp()) : () -> this.c.a($$0, this.dp());
   }

   @Override
   public cov.a v() {
      return cov.a.e;
   }

   @Override
   public dse x() {
      return dfd.ct.o();
   }

   @Override
   protected void a(us $$0) {
      super.a($$0);
      this.c.a(this.dP(), this.dp(), $$0);
   }

   @Override
   protected void b(us $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dP(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public dbc B() {
      return this.c;
   }

   @Override
   public boolean cP() {
      return true;
   }
}
