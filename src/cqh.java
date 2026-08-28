public class cqh extends cpv {
   private final ddk c = new ddk() {
      @Override
      public void a(dej $$0, jf $$1, int $$2) {
         $$0.a(cqh.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cqh(bty<? extends cqh> $$0, dej $$1) {
      super($$0, $$1);
      this.d = this.c($$1);
   }

   public cqh(dej $$0, double $$1, double $$2, double $$3) {
      super(bty.aU, $$0, $$1, $$2, $$3);
      this.d = this.c($$0);
   }

   @Override
   protected cvn ak_() {
      return cvw.nM;
   }

   private Runnable c(dej $$0) {
      return $$0 instanceof arj ? () -> this.c.a((arj)$$0, this.ds()) : () -> this.c.a($$0, this.ds());
   }

   @Override
   public cpv.a y() {
      return cpv.a.e;
   }

   @Override
   public dus A() {
      return dho.ct.n();
   }

   @Override
   protected void a(ug $$0) {
      super.a($$0);
      this.c.a(this.dS(), this.ds(), $$0);
   }

   @Override
   protected void b(ug $$0) {
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

   public ddk F() {
      return this.c;
   }

   @Override
   public boolean cT() {
      return true;
   }
}
