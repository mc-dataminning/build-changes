public class coe extends cnt {
   private final dab c = new dab() {
      @Override
      public void a(daz $$0, io $$1, int $$2) {
         $$0.a(coe.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public coe(bsc<? extends coe> $$0, daz $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public coe(daz $$0, double $$1, double $$2, double $$3) {
      super(bsc.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected ctl ah_() {
      return ctt.nM;
   }

   private Runnable b(daz $$0) {
      return $$0 instanceof aqn ? () -> this.c.a((aqn)$$0, this.dp()) : () -> this.c.a($$0, this.dp());
   }

   @Override
   public cnt.a v() {
      return cnt.a.e;
   }

   @Override
   public drd x() {
      return dec.ct.n();
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

   public dab B() {
      return this.c;
   }

   @Override
   public boolean cP() {
      return true;
   }
}
