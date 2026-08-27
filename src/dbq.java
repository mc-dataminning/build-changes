public class dbq extends czp implements dbo {
   private final dbo.a e;

   public dbq(dbo.a $$0, dez.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
