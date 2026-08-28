public class cpd extends cos {
   private final daz c = new daz() {
      @Override
      public void a(dbx $$0, iz $$1, int $$2) {
         $$0.a(cpd.this, (byte)$$2);
      }
   };
   private final Runnable d;

   public cpd(bsz<? extends cpd> $$0, dbx $$1) {
      super($$0, $$1);
      this.d = this.b($$1);
   }

   public cpd(dbx $$0, double $$1, double $$2, double $$3) {
      super(bsz.aU, $$0, $$1, $$2, $$3);
      this.d = this.b($$0);
   }

   @Override
   protected cuj ag_() {
      return cur.nM;
   }

   private Runnable b(dbx $$0) {
      return $$0 instanceof are ? () -> this.c.a((are)$$0, this.dp()) : () -> this.c.a($$0, this.dp());
   }

   @Override
   public cos.a v() {
      return cos.a.e;
   }

   @Override
   public dsb x() {
      return dfa.ct.o();
   }

   @Override
   protected void a(ur $$0) {
      super.a($$0);
      this.c.a(this.dP(), this.dp(), $$0);
   }

   @Override
   protected void b(ur $$0) {
      super.b($$0);
      this.c.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.c.a(this.dP(), $$0);
   }

   @Override
   public void l() {
      super.l();
      this.d.run();
   }

   public daz B() {
      return this.c;
   }

   @Override
   public boolean cP() {
      return true;
   }
}
