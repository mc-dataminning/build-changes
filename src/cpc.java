public class cpc extends cor {
   private final day c = new day() {
      @Override
      public void a(dbw $$0, iz $$1, int $$2) {
         $$0.a(cpc.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cpc(bsy<? extends cpc> $$0, dbw $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cpc(dbw $$0, double $$1, double $$2, double $$3) {
      super(bsy.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cui ah_() {
      return cuq.nM;
   }

   private Runnable b(dbw $$0) {
      return $$0 instanceof are ? () -> this.c.a((are)$$0, this.dp()) : () -> this.c.a($$0, this.dp());
   }

   @Override
   public cor.a v() {
      return cor.a.e;
   }

   @Override
   public dsa x() {
      return dez.ct.o();
   }

   @Override
   protected void a(ur $$0) {
      super.a($$0);
      this.c.a(this.dP(), this.dp(), $$0);
   }

   @Override
   protected void b(ur $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dP(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public day B() {
      return this.c;
   }

   @Override
   public boolean cP() {
      return true;
   }
}
