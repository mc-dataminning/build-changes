public class dbo extends czn implements dbm {
   private final dbm.a e;

   public dbo(dbm.a $$0, dex.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dey $$0) {
      return dbm.c($$0.b()).isPresent();
   }

   public dbm.a g() {
      return this.e;
   }
}
