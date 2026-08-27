public class flp extends fki {
   flp(fie $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, flr $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements fkz<iz> {
      private final flr a;

      public a(flr $$0) {
         this.a = $$0;
      }

      public fkw a(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flp($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
