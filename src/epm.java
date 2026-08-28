public class epm implements epn {
   private final dcg b;

   public epm(dcg $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jf $$0, dsl $$1, ja $$2, ja $$3, int $$4, int $$5) {
      epn.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(ja $$0, dfi $$1, ja $$2) {
      dsl $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dsl $$0, ja $$1, dfi $$2, ja $$3, boolean $$4) {
      epn.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
