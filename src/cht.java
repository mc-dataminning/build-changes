public class cht extends chi {
   private final csz c = new csz() {
      @Override
      public void a(ctx $$0, hx $$1, int $$2) {
         $$0.a(cht.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cht(bmc<? extends cht> $$0, ctx $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cht(ctx $$0, double $$1, double $$2, double $$3) {
      super(bmc.aS, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cnb ai_() {
      return cnj.nL;
   }

   private Runnable b(ctx $$0) {
      return $$0 instanceof ane ? () -> this.c.a((ane)$$0, this.dl()) : () -> this.c.a($$0, this.dl());
   }

   @Override
   public chi.a w() {
      return chi.a.e;
   }

   @Override
   public djp y() {
      return cxa.ct.o();
   }

   @Override
   protected void a(so $$0) {
      super.a($$0);
      this.c.a(this.dL(), this.dl(), $$0);
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dL(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public csz C() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
