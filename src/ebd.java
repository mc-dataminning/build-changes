public class ebd implements ebe {
   private final cpl b;

   public ebd(cpl $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ha $$0, dez $$1, gu $$2, gu $$3, int $$4, int $$5) {
      ebe.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(gu $$0, csl $$1, gu $$2) {
      dez $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dez $$0, gu $$1, csl $$2, gu $$3, boolean $$4) {
      ebe.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
