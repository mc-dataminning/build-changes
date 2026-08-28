public class cpf extends cou {
   private final dbb c = new dbb() {
      @Override
      public void a(dbz $$0, iz $$1, int $$2) {
         $$0.a(cpf.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cpf(btb<? extends cpf> $$0, dbz $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cpf(dbz $$0, double $$1, double $$2, double $$3) {
      super(btb.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cul ag_() {
      return cut.nM;
   }

   private Runnable b(dbz $$0) {
      return $$0 instanceof arf ? () -> this.c.a((arf)$$0, this.dp()) : () -> this.c.a($$0, this.dp());
   }

   @Override
   public cou.a v() {
      return cou.a.e;
   }

   @Override
   public dsd x() {
      return dfc.ct.o();
   }

   @Override
   protected void a(us $$0) {
      super.a($$0);
      this.c.a(this.dP(), this.dp(), $$0);
   }

   @Override
   protected void b(us $$0) {
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

   public dbb B() {
      return this.c;
   }

   @Override
   public boolean cP() {
      return true;
   }
}
