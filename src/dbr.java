public class dbr extends dag implements dbo {
   private final dbo.a F;

   public dbr(dbo.a $$0, dfa $$1, dez.d $$2) {
      super($$1, $$2);
      this.F = $$0;
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dfa $$0) {
      return dbo.c($$0.b()).isPresent();
   }

   public dbo.a g() {
      return this.F;
   }
}
