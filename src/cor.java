public class cor extends cof {
   private final dbh c = new dbh() {
      @Override
      public void a(dcf $$0, ja $$1, int $$2) {
         $$0.a(cor.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cor(bsm<? extends cor> $$0, dcf $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cor(dcf $$0, double $$1, double $$2, double $$3) {
      super(bsm.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected ctx ag_() {
      return cuf.nM;
   }

   private Runnable b(dcf $$0) {
      return $$0 instanceof aqm ? () -> this.c.a((aqm)$$0, this.dq()) : () -> this.c.a($$0, this.dq());
   }

   @Override
   public cof.a v() {
      return cof.a.e;
   }

   @Override
   public dsk x() {
      return dfj.ct.o();
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.c.a(this.dQ(), this.dq(), $$0);
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dQ(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public dbh B() {
      return this.c;
   }

   @Override
   public boolean cQ() {
      return true;
   }
}
