public class cez extends ceo {
   private final cqb c = new cqb() {
      @Override
      public void a(cqz $$0, ht $$1, int $$2) {
         $$0.a(cez.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cez(bjx<? extends cez> $$0, cqz $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cez(cqz $$0, double $$1, double $$2, double $$3) {
      super(bjx.aQ, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cke ag_() {
      return ckm.na;
   }

   private Runnable b(cqz $$0) {
      return $$0 instanceof alq ? () -> this.c.a((alq)$$0, this.dl()) : () -> this.c.a($$0, this.dl());
   }

   @Override
   public ceo.a v() {
      return ceo.a.e;
   }

   @Override
   public dgb x() {
      return cuc.ct.o();
   }

   @Override
   protected void a(rt $$0) {
      super.a($$0);
      this.c.a(this.dL(), this.dl(), $$0);
   }

   @Override
   protected void b(rt $$0) {
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

   public cqb B() {
      return this.c;
   }

   @Override
   public boolean cM() {
      return true;
   }
}
