public class csu extends csh {
   private final dgr b = new dgr() {
      @Override
      public void a(dhp $$0, jj $$1, int $$2) {
         $$0.a(csu.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public csu(bwb<? extends csu> $$0, dhp $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cxu o() {
      return cyc.oq;
   }

   @Override
   public cxy dI() {
      return new cxy(cyc.oq);
   }

   private Runnable c(dhp $$0) {
      return $$0 instanceof arn ? () -> this.b.a((arn)$$0, this.dv()) : () -> this.b.a($$0, this.dv());
   }

   @Override
   public dym v() {
      return dkw.cA.m();
   }

   @Override
   protected void a(tw $$0) {
      super.a($$0);
      this.b.a(this.dV(), this.dv(), $$0);
   }

   @Override
   protected void b(tw $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.b.a(this.dV(), $$0);
   }

   @Override
   public void h() {
      super.h();
      this.c.run();
   }

   public dgr q() {
      return this.b;
   }
}
