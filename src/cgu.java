public class cgu extends cgj {
   private final csa c = new csa() {
      @Override
      public void a(csy $$0, hv $$1, int $$2) {
         $$0.a(cgu.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cgu(blj<? extends cgu> $$0, csy $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cgu(csy $$0, double $$1, double $$2, double $$3) {
      super(blj.aR, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cmc ah_() {
      return cmk.nL;
   }

   private Runnable b(csy $$0) {
      return $$0 instanceof amp ? () -> this.c.a((amp)$$0, this.dm()) : () -> this.c.a($$0, this.dm());
   }

   @Override
   public cgj.a w() {
      return cgj.a.e;
   }

   @Override
   public dip y() {
      return cwb.ct.o();
   }

   @Override
   protected void a(sj $$0) {
      super.a($$0);
      this.c.a(this.dM(), this.dm(), $$0);
   }

   @Override
   protected void b(sj $$0) {
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

   public csa C() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
