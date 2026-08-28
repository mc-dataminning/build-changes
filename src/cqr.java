public class cqr extends cqf {
   private final ddw c = new ddw() {
      @Override
      public void a(dev $$0, jg $$1, int $$2) {
         $$0.a(cqr.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cqr(bug<? extends cqr> $$0, dev $$1) {
      super($$0, $$1);
      this.d = this.c($$1);
   }

   public cqr(dev $$0, double $$1, double $$2, double $$3) {
      super(bug.aU, $$0, $$1, $$2, $$3);
      this.d = this.c($$0);
   }

   @Override
   protected cvt al_() {
      return cwb.nM;
   }

   private Runnable c(dev $$0) {
      return $$0 instanceof arm ? () -> this.c.a((arm)$$0, this.dx()) : () -> this.c.a($$0, this.dx());
   }

   @Override
   public cqf.a y() {
      return cqf.a.e;
   }

   @Override
   public dvd A() {
      return dia.ct.m();
   }

   @Override
   protected void a(uj $$0) {
      super.a($$0);
      this.c.a(this.dX(), this.dx(), $$0);
   }

   @Override
   protected void b(uj $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dX(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public ddw E() {
      return this.c;
   }

   @Override
   public boolean cX() {
      return true;
   }
}
