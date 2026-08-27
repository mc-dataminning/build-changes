public class cfw extends cfl {
   private final crc c = new crc() {
      @Override
      public void a(csa $$0, ht $$1, int $$2) {
         $$0.a(cfw.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cfw(bku<? extends cfw> $$0, csa $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cfw(csa $$0, double $$1, double $$2, double $$3) {
      super(bku.aQ, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cle ag_() {
      return clm.nL;
   }

   private Runnable b(csa $$0) {
      return $$0 instanceof ame ? () -> this.c.a((ame)$$0, this.dn()) : () -> this.c.a($$0, this.dn());
   }

   @Override
   public cfl.a w() {
      return cfl.a.e;
   }

   @Override
   public dhi y() {
      return cvc.ct.o();
   }

   @Override
   protected void a(rz $$0) {
      super.a($$0);
      this.c.a(this.dN(), this.dn(), $$0);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dN(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public crc C() {
      return this.c;
   }

   @Override
   public boolean cN() {
      return true;
   }
}
