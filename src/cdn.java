public class cdn extends cdc {
   private final col c = new col() {
      @Override
      public void a(cpk $$0, gv $$1, int $$2) {
         $$0.a(cdn.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cdn(bik<? extends cdn> $$0, cpk $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cdn(cpk $$0, double $$1, double $$2, double $$3) {
      super(bik.aQ, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cir j() {
      return ciz.na;
   }

   private Runnable b(cpk $$0) {
      return $$0 instanceof aki ? () -> this.c.a((aki)$$0, this.dk()) : () -> this.c.a($$0, this.dk());
   }

   @Override
   public cdc.a t() {
      return cdc.a.e;
   }

   @Override
   public dey w() {
      return csl.ct.n();
   }

   @Override
   protected void a(qs $$0) {
      super.a($$0);
      this.c.a(this.dK(), this.dk(), $$0);
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dK(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public col A() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
