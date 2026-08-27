public class chl extends cha {
   private final csr c = new csr() {
      @Override
      public void a(ctp $$0, hx $$1, int $$2) {
         $$0.a(chl.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public chl(blz<? extends chl> $$0, ctp $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public chl(ctp $$0, double $$1, double $$2, double $$3) {
      super(blz.aR, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cmt ah_() {
      return cnb.nL;
   }

   private Runnable b(ctp $$0) {
      return $$0 instanceof and ? () -> this.c.a((and)$$0, this.dm()) : () -> this.c.a($$0, this.dm());
   }

   @Override
   public cha.a w() {
      return cha.a.e;
   }

   @Override
   public djh y() {
      return cws.ct.o();
   }

   @Override
   protected void a(sn $$0) {
      super.a($$0);
      this.c.a(this.dM(), this.dm(), $$0);
   }

   @Override
   protected void b(sn $$0) {
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

   public csr C() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
