public class cpc extends cor {
   private final dbw c = new dbw() {
      @Override
      public void a(dcu $$0, jd $$1, int $$2) {
         $$0.a(cpc.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cpc(bsw<? extends cpc> $$0, dcu $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cpc(dcu $$0, double $$1, double $$2, double $$3) {
      super(bsw.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cuj ag_() {
      return cur.nM;
   }

   private Runnable b(dcu $$0) {
      return $$0 instanceof aqt ? () -> this.c.a((aqt)$$0, this.dq()) : () -> this.c.a($$0, this.dq());
   }

   @Override
   public cor.a v() {
      return cor.a.e;
   }

   @Override
   public dta x() {
      return dfy.ct.o();
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.c.a(this.dQ(), this.dq(), $$0);
   }

   @Override
   protected void b(ua $$0) {
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

   public dbw B() {
      return this.c;
   }

   @Override
   public boolean cQ() {
      return true;
   }
}
