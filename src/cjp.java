public class cjp extends cje {
   private final cut c = new cut() {
      @Override
      public void a(cvr $$0, hz $$1, int $$2) {
         $$0.a(cjp.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cjp(bnw<? extends cjp> $$0, cvr $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cjp(cvr $$0, double $$1, double $$2, double $$3) {
      super(bnw.aS, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected coy ai_() {
      return cpg.nL;
   }

   private Runnable b(cvr $$0) {
      return $$0 instanceof aow ? () -> this.c.a((aow)$$0, this.dm()) : () -> this.c.a($$0, this.dm());
   }

   @Override
   public cje.a w() {
      return cje.a.e;
   }

   @Override
   public dlj y() {
      return cyu.ct.o();
   }

   @Override
   protected void a(sw $$0) {
      super.a($$0);
      this.c.a(this.dM(), this.dm(), $$0);
   }

   @Override
   protected void b(sw $$0) {
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

   public cut C() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
