public class cpy extends cpm {
   private final dct c = new dct() {
      @Override
      public void a(dds $$0, je $$1, int $$2) {
         $$0.a(cpy.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cpy(btq<? extends cpy> $$0, dds $$1) {
      super($$0, $$1);
      this.d = this.c($$1);
   }

   public cpy(dds $$0, double $$1, double $$2, double $$3) {
      super(btq.aU, $$0, $$1, $$2, $$3);
      this.d = this.c($$0);
   }

   @Override
   protected cvg aj_() {
      return cvo.nM;
   }

   private Runnable c(dds $$0) {
      return $$0 instanceof arg ? () -> this.c.a((arg)$$0, this.ds()) : () -> this.c.a($$0, this.ds());
   }

   @Override
   public cpm.a x() {
      return cpm.a.e;
   }

   @Override
   public dua z() {
      return dgx.ct.o();
   }

   @Override
   protected void a(uf $$0) {
      super.a($$0);
      this.c.a(this.dS(), this.ds(), $$0);
   }

   @Override
   protected void b(uf $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dS(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public dct E() {
      return this.c;
   }

   @Override
   public boolean cT() {
      return true;
   }
}
