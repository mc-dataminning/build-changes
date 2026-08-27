public class cjl extends cja {
   private final cup c = new cup() {
      @Override
      public void a(cvn $$0, hz $$1, int $$2) {
         $$0.a(cjl.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cjl(bnu<? extends cjl> $$0, cvn $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cjl(cvn $$0, double $$1, double $$2, double $$3) {
      super(bnu.aS, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cou ai_() {
      return cpc.nL;
   }

   private Runnable b(cvn $$0) {
      return $$0 instanceof aov ? () -> this.c.a((aov)$$0, this.dm()) : () -> this.c.a($$0, this.dm());
   }

   @Override
   public cja.a w() {
      return cja.a.e;
   }

   @Override
   public dlf y() {
      return cyq.ct.o();
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

   public cup C() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
