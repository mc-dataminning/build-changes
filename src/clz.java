public class clz extends clo {
   private final cxz c = new cxz() {
      @Override
      public void a(cyx $$0, ib $$1, int $$2) {
         $$0.a(clz.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public clz(bqb<? extends clz> $$0, cyx $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public clz(cyx $$0, double $$1, double $$2, double $$3) {
      super(bqb.aT, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cre ag_() {
      return crm.nL;
   }

   private Runnable b(cyx $$0) {
      return $$0 instanceof aps ? () -> this.c.a((aps)$$0, this.dm()) : () -> this.c.a($$0, this.dm());
   }

   @Override
   public clo.a v() {
      return clo.a.e;
   }

   @Override
   public doz x() {
      return dca.ct.n();
   }

   @Override
   protected void a(tm $$0) {
      super.a($$0);
      this.c.a(this.dM(), this.dm(), $$0);
   }

   @Override
   protected void b(tm $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dM(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public cxz B() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
