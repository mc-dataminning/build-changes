public class coo extends coc {
   private final dbf c = new dbf() {
      @Override
      public void a(dcd $$0, ja $$1, int $$2) {
         $$0.a(coo.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public coo(bsj<? extends coo> $$0, dcd $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public coo(dcd $$0, double $$1, double $$2, double $$3) {
      super(bsj.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected ctv ag_() {
      return cud.nM;
   }

   private Runnable b(dcd $$0) {
      return $$0 instanceof aqk ? () -> this.c.a((aqk)$$0, this.dp()) : () -> this.c.a($$0, this.dp());
   }

   @Override
   public coc.a v() {
      return coc.a.e;
   }

   @Override
   public dsh x() {
      return dfh.ct.o();
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.c.a(this.dP(), this.dp(), $$0);
   }

   @Override
   protected void b(tx $$0) {
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

   public dbf B() {
      return this.c;
   }

   @Override
   public boolean cP() {
      return true;
   }
}
