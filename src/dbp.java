public class dbp extends csm implements dbo {
   private final dbo.a d;

   public dbp(dbo.a $$0, dez.d $$1) {
      super($$1);
      this.d = $$0;
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
      return this.d;
   }
}
