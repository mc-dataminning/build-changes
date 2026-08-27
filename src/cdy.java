public class cdy extends cdn {
   private final coz c = new coz() {
      @Override
      public void a(cpx $$0, gw $$1, int $$2) {
         $$0.a(cdy.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cdy(biw<? extends cdy> $$0, cpx $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cdy(cpx $$0, double $$1, double $$2, double $$3) {
      super(biw.aQ, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cjc q() {
      return cjk.na;
   }

   private Runnable b(cpx $$0) {
      return $$0 instanceof aks ? () -> this.c.a((aks)$$0, this.dl()) : () -> this.c.a($$0, this.dl());
   }

   @Override
   public cdn.a z() {
      return cdn.a.e;
   }

   @Override
   public dfl B() {
      return csy.ct.n();
   }

   @Override
   protected void a(qy $$0) {
      super.a($$0);
      this.c.a(this.dL(), this.dl(), $$0);
   }

   @Override
   protected void b(qy $$0) {
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

   public coz G() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
