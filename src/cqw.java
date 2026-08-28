public class cqw extends cqk {
   private final dec c = new dec() {
      @Override
      public void a(dfb $$0, jh $$1, int $$2) {
         $$0.a(cqw.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cqw(bul<? extends cqw> $$0, dfb $$1) {
      super($$0, $$1);
      this.d = this.c($$1);
   }

   public cqw(dfb $$0, double $$1, double $$2, double $$3) {
      super(bul.aU, $$0, $$1, $$2, $$3);
      this.d = this.c($$0);
   }

   @Override
   protected cvx al_() {
      return cwf.nM;
   }

   private Runnable c(dfb $$0) {
      return $$0 instanceof arn ? () -> this.c.a((arn)$$0, this.dx()) : () -> this.c.a($$0, this.dx());
   }

   @Override
   public cqk.a y() {
      return cqk.a.e;
   }

   @Override
   public dvj A() {
      return dig.ct.m();
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      this.c.a(this.dX(), this.dx(), $$0);
   }

   @Override
   protected void b(uk $$0) {
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

   public dec E() {
      return this.c;
   }

   @Override
   public boolean cX() {
      return true;
   }
}
