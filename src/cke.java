public class cke extends cjt {
   private final cvg c = new cvg() {
      @Override
      public void a(cwe $$0, ib $$1, int $$2) {
         $$0.a(cke.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cke(bol<? extends cke> $$0, cwe $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cke(cwe $$0, double $$1, double $$2, double $$3) {
      super(bol.aS, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cpl ai_() {
      return cpt.nL;
   }

   private Runnable b(cwe $$0) {
      return $$0 instanceof apa ? () -> this.c.a((apa)$$0, this.dj()) : () -> this.c.a($$0, this.dj());
   }

   @Override
   public cjt.a w() {
      return cjt.a.e;
   }

   @Override
   public dme y() {
      return czh.ct.o();
   }

   @Override
   protected void a(sy $$0) {
      super.a($$0);
      this.c.a(this.dJ(), this.dj(), $$0);
   }

   @Override
   protected void b(sy $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dJ(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public cvg C() {
      return this.c;
   }

   @Override
   public boolean cJ() {
      return true;
   }
}
