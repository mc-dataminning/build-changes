public class cfo extends cfd {
   private final cqu c = new cqu() {
      @Override
      public void a(crs $$0, ht $$1, int $$2) {
         $$0.a(cfo.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cfo(bkm<? extends cfo> $$0, crs $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cfo(crs $$0, double $$1, double $$2, double $$3) {
      super(bkm.aQ, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected ckw ag_() {
      return cle.na;
   }

   private Runnable b(crs $$0) {
      return $$0 instanceof ama ? () -> this.c.a((ama)$$0, this.dl()) : () -> this.c.a($$0, this.dl());
   }

   @Override
   public cfd.a v() {
      return cfd.a.e;
   }

   @Override
   public dgw x() {
      return cuv.ct.o();
   }

   @Override
   protected void a(rz $$0) {
      super.a($$0);
      this.c.a(this.dL(), this.dl(), $$0);
   }

   @Override
   protected void b(rz $$0) {
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

   public cqu B() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
