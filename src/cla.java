public class cla extends ckp {
   private final cwd c = new cwd() {
      @Override
      public void a(cxb $$0, ib $$1, int $$2) {
         $$0.a(cla.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cla(bpd<? extends cla> $$0, cxb $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cla(cxb $$0, double $$1, double $$2, double $$3) {
      super(bpd.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cqh ah_() {
      return cqp.nL;
   }

   private Runnable b(cxb $$0) {
      return $$0 instanceof apf ? () -> this.c.a((apf)$$0, this.dm()) : () -> this.c.a($$0, this.dm());
   }

   @Override
   public ckp.a v() {
      return ckp.a.e;
   }

   @Override
   public dnb x() {
      return dae.ct.o();
   }

   @Override
   protected void a(ta $$0) {
      super.a($$0);
      this.c.a(this.dM(), this.dm(), $$0);
   }

   @Override
   protected void b(ta $$0) {
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

   public cwd B() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
