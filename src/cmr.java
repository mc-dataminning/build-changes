public class cmr extends cmg {
   private final cyw c = new cyw() {
      @Override
      public void a(czu $$0, im $$1, int $$2) {
         $$0.a(cmr.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cmr(bqr<? extends cmr> $$0, czu $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cmr(czu $$0, double $$1, double $$2, double $$3) {
      super(bqr.aT, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cry ag_() {
      return csg.nM;
   }

   private Runnable b(czu $$0) {
      return $$0 instanceof aqe ? () -> this.c.a((aqe)$$0, this.dn()) : () -> this.c.a($$0, this.dn());
   }

   @Override
   public cmg.a v() {
      return cmg.a.e;
   }

   @Override
   public dpy x() {
      return dcx.ct.n();
   }

   @Override
   protected void a(ty $$0) {
      super.a($$0);
      this.c.a(this.dN(), this.dn(), $$0);
   }

   @Override
   protected void b(ty $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dN(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public cyw B() {
      return this.c;
   }

   @Override
   public boolean cN() {
      return true;
   }
}
