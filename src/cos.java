public class cos extends cog {
   private final dbi c = new dbi() {
      @Override
      public void a(dcg $$0, ja $$1, int $$2) {
         $$0.a(cos.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cos(bsn<? extends cos> $$0, dcg $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cos(dcg $$0, double $$1, double $$2, double $$3) {
      super(bsn.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cty ag_() {
      return cug.nM;
   }

   private Runnable b(dcg $$0) {
      return $$0 instanceof aqm ? () -> this.c.a((aqm)$$0, this.dr()) : () -> this.c.a($$0, this.dr());
   }

   @Override
   public cog.a v() {
      return cog.a.e;
   }

   @Override
   public dsl x() {
      return dfk.ct.o();
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.c.a(this.dR(), this.dr(), $$0);
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dR(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public dbi B() {
      return this.c;
   }

   @Override
   public boolean cR() {
      return true;
   }
}
