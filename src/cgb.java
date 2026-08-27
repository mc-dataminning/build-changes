public class cgb extends cfq {
   private final crh c = new crh() {
      @Override
      public void a(csf $$0, hx $$1, int $$2) {
         $$0.a(cgb.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cgb(bkz<? extends cgb> $$0, csf $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cgb(csf $$0, double $$1, double $$2, double $$3) {
      super(bkz.aQ, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected clj ah_() {
      return clr.nL;
   }

   private Runnable b(csf $$0) {
      return $$0 instanceof ami ? () -> this.c.a((ami)$$0, this.dn()) : () -> this.c.a($$0, this.dn());
   }

   @Override
   public cfq.a w() {
      return cfq.a.e;
   }

   @Override
   public dhn y() {
      return cvh.ct.o();
   }

   @Override
   protected void a(sd $$0) {
      super.a($$0);
      this.c.a(this.dN(), this.dn(), $$0);
   }

   @Override
   protected void b(sd $$0) {
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

   public crh C() {
      return this.c;
   }

   @Override
   public boolean cN() {
      return true;
   }
}
