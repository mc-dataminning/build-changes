public class fky extends fkz<ip> {
   protected fky(fis $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ip $$7, fml $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static class a implements flt<ip> {
      private final fml a;

      public a(fml $$0) {
         this.a = $$0;
      }

      public flq a(ip $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fky($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
      }
   }
}
