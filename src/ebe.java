public class ebe implements ebf {
   private final cpm b;

   public ebe(cpm $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ha $$0, dfa $$1, gu $$2, gu $$3, int $$4, int $$5) {
      ebf.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(gu $$0, csm $$1, gu $$2) {
      dfa $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dfa $$0, gu $$1, csm $$2, gu $$3, boolean $$4) {
      ebf.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
