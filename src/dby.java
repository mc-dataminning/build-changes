public class dby extends csv implements dbx {
   private final dbx.a d;

   public dby(dbx.a $$0, dfi.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public void b(dfj $$0, akq $$1, gw $$2, asc $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dfj $$0) {
      return dbx.c($$0.b()).isPresent();
   }

   public dbx.a g() {
      return this.d;
   }
}
