public class ctr extends cte {
   private final dhr b = new dhr() {
      @Override
      public void a(dip $$0, iu $$1, int $$2) {
         $$0.a(ctr.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public ctr(bwj<? extends ctr> $$0, dip $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected cyo o() {
      return cyw.oq;
   }

   @Override
   public cys dI() {
      return new cys(cyw.oq);
   }

   private Runnable c(dip $$0) {
      return $$0 instanceof aro ? () -> this.b.a((aro)$$0, this.dv()) : () -> this.b.a($$0, this.dv());
   }

   @Override
   public dzo v() {
      return dlw.cA.m();
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.b.a(this.dV(), this.dv(), $$0);
   }

   @Override
   protected void b(tx $$0) {
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

   public dhr q() {
      return this.b;
   }
}
