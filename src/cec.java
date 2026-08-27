public class cec extends cdr {
   private final cpd c = new cpd() {
      @Override
      public void a(cqb $$0, gw $$1, int $$2) {
         $$0.a(cec.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cec(bja<? extends cec> $$0, cqb $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cec(cqb $$0, double $$1, double $$2, double $$3) {
      super(bja.aQ, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cjg q() {
      return cjo.na;
   }

   private Runnable b(cqb $$0) {
      return $$0 instanceof akt ? () -> this.c.a((akt)$$0, this.dl()) : () -> this.c.a($$0, this.dl());
   }

   @Override
   public cdr.a z() {
      return cdr.a.e;
   }

   @Override
   public dfd B() {
      return cte.ct.o();
   }

   @Override
   protected void a(qw $$0) {
      super.a($$0);
      this.c.a(this.dL(), this.dl(), $$0);
   }

   @Override
   protected void b(qw $$0) {
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

   public cpd G() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
