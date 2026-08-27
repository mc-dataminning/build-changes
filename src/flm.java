public class flm extends fko {
   protected flm(fie $$0, double $$1, double $$2, double $$3, double $$4, flr $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements fkz<iz> {
      private final flr a;

      public a(flr $$0) {
         this.a = $$0;
      }

      public fkw a(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flm($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
