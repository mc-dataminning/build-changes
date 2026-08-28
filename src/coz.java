public class coz extends coo {
   private final dav c = new dav() {
      @Override
      public void a(dbt $$0, iz $$1, int $$2) {
         $$0.a(coz.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public coz(bsv<? extends coz> $$0, dbt $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public coz(dbt $$0, double $$1, double $$2, double $$3) {
      super(bsv.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cuf ah_() {
      return cun.nM;
   }

   private Runnable b(dbt $$0) {
      return $$0 instanceof arb ? () -> this.c.a((arb)$$0, this.dp()) : () -> this.c.a($$0, this.dp());
   }

   @Override
   public coo.a v() {
      return coo.a.e;
   }

   @Override
   public drx x() {
      return dew.ct.n();
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

   public dav B() {
      return this.c;
   }

   @Override
   public boolean cP() {
      return true;
   }
}
