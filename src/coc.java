public class coc extends cnr {
   private final czz c = new czz() {
      @Override
      public void a(dax $$0, io $$1, int $$2) {
         $$0.a(coc.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public coc(bsa<? extends coc> $$0, dax $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public coc(dax $$0, double $$1, double $$2, double $$3) {
      super(bsa.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected ctj ag_() {
      return ctr.nM;
   }

   private Runnable b(dax $$0) {
      return $$0 instanceof aqm ? () -> this.c.a((aqm)$$0, this.dp()) : () -> this.c.a($$0, this.dp());
   }

   @Override
   public cnr.a v() {
      return cnr.a.e;
   }

   @Override
   public drb x() {
      return dea.ct.n();
   }

   @Override
   protected void a(ud $$0) {
      super.a($$0);
      this.c.a(this.dP(), this.dp(), $$0);
   }

   @Override
   protected void b(ud $$0) {
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

   public czz B() {
      return this.c;
   }

   @Override
   public boolean cP() {
      return true;
   }
}
