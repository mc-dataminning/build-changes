public class cnn extends cnc {
   private final czf c = new czf() {
      @Override
      public void a(dad $$0, in $$1, int $$2) {
         $$0.a(cnn.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cnn(brn<? extends cnn> $$0, dad $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cnn(dad $$0, double $$1, double $$2, double $$3) {
      super(brn.aT, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected csu ag_() {
      return ctc.nM;
   }

   private Runnable b(dad $$0) {
      return $$0 instanceof aqh ? () -> this.c.a((aqh)$$0, this.dn()) : () -> this.c.a($$0, this.dn());
   }

   @Override
   public cnc.a v() {
      return cnc.a.e;
   }

   @Override
   public dqh x() {
      return ddg.ct.n();
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.c.a(this.dN(), this.dn(), $$0);
   }

   @Override
   protected void b(ua $$0) {
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

   public czf B() {
      return this.c;
   }

   @Override
   public boolean cN() {
      return true;
   }
}
