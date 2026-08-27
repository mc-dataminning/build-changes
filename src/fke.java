public class fke extends fkf<iq> {
   protected fke(fie $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, iq $$7, flr $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static class a implements fkz<iq> {
      private final flr a;

      public a(flr $$0) {
         this.a = $$0;
      }

      public fkw a(iq $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fke($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
      }
   }
}
