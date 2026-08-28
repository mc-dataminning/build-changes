public class cpe extends cot {
   private final dba c = new dba() {
      @Override
      public void a(dby $$0, iz $$1, int $$2) {
         $$0.a(cpe.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cpe(bta<? extends cpe> $$0, dby $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cpe(dby $$0, double $$1, double $$2, double $$3) {
      super(bta.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cuk ag_() {
      return cus.nM;
   }

   private Runnable b(dby $$0) {
      return $$0 instanceof arf ? () -> this.c.a((arf)$$0, this.dp()) : () -> this.c.a($$0, this.dp());
   }

   @Override
   public cot.a v() {
      return cot.a.e;
   }

   @Override
   public dsc x() {
      return dfb.ct.o();
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

   public dba B() {
      return this.c;
   }

   @Override
   public boolean cP() {
      return true;
   }
}
