public class cqe extends cps {
   private final ddh c = new ddh() {
      @Override
      public void a(deg $$0, je $$1, int $$2) {
         $$0.a(cqe.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cqe(btv<? extends cqe> $$0, deg $$1) {
      super($$0, $$1);
      this.d = this.c($$1);
   }

   public cqe(deg $$0, double $$1, double $$2, double $$3) {
      super(btv.aU, $$0, $$1, $$2, $$3);
      this.d = this.c($$0);
   }

   @Override
   protected cvk aj_() {
      return cvt.nM;
   }

   private Runnable c(deg $$0) {
      return $$0 instanceof arh ? () -> this.c.a((arh)$$0, this.ds()) : () -> this.c.a($$0, this.ds());
   }

   @Override
   public cps.a y() {
      return cps.a.e;
   }

   @Override
   public duo A() {
      return dhl.ct.o();
   }

   @Override
   protected void a(uf $$0) {
      super.a($$0);
      this.c.a(this.dS(), this.ds(), $$0);
   }

   @Override
   protected void b(uf $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dS(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public ddh F() {
      return this.c;
   }

   @Override
   public boolean cT() {
      return true;
   }
}
