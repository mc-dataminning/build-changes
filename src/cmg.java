public class cmg extends clv {
   private final cyi c = new cyi() {
      @Override
      public void a(czg $$0, id $$1, int $$2) {
         $$0.a(cmg.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cmg(bqg<? extends cmg> $$0, czg $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cmg(czg $$0, double $$1, double $$2, double $$3) {
      super(bqg.aT, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected crn ag_() {
      return crv.nL;
   }

   private Runnable b(czg $$0) {
      return $$0 instanceof apu ? () -> this.c.a((apu)$$0, this.dm()) : () -> this.c.a($$0, this.dm());
   }

   @Override
   public clv.a v() {
      return clv.a.e;
   }

   @Override
   public dpi x() {
      return dcj.ct.n();
   }

   @Override
   protected void a(to $$0) {
      super.a($$0);
      this.c.a(this.dM(), this.dm(), $$0);
   }

   @Override
   protected void b(to $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dM(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public cyi B() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
