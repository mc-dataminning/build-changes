public class cky extends ckn {
   private final cwb c = new cwb() {
      @Override
      public void a(cwz $$0, ib $$1, int $$2) {
         $$0.a(cky.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cky(bpc<? extends cky> $$0, cwz $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cky(cwz $$0, double $$1, double $$2, double $$3) {
      super(bpc.aT, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cqf ah_() {
      return cqn.nL;
   }

   private Runnable b(cwz $$0) {
      return $$0 instanceof apf ? () -> this.c.a((apf)$$0, this.dm()) : () -> this.c.a($$0, this.dm());
   }

   @Override
   public ckn.a v() {
      return ckn.a.e;
   }

   @Override
   public dmz x() {
      return dac.ct.o();
   }

   @Override
   protected void a(ta $$0) {
      super.a($$0);
      this.c.a(this.dM(), this.dm(), $$0);
   }

   @Override
   protected void b(ta $$0) {
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

   public cwb B() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
