public class cpe extends cot {
   private final dby c = new dby() {
      @Override
      public void a(dcw $$0, jd $$1, int $$2) {
         $$0.a(cpe.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cpe(bsx<? extends cpe> $$0, dcw $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cpe(dcw $$0, double $$1, double $$2, double $$3) {
      super(bsx.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cul ak_() {
      return cut.nM;
   }

   private Runnable b(dcw $$0) {
      return $$0 instanceof aqu ? () -> this.c.a((aqu)$$0, this.do()) : () -> this.c.a($$0, this.do());
   }

   @Override
   public cot.a v() {
      return cot.a.e;
   }

   @Override
   public dtc x() {
      return dga.ct.o();
   }

   @Override
   protected void a(ub $$0) {
      super.a($$0);
      this.c.a(this.dO(), this.do(), $$0);
   }

   @Override
   protected void b(ub $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dO(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public dby B() {
      return this.c;
   }

   @Override
   public boolean cP() {
      return true;
   }
}
