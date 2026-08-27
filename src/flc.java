public class flc extends fld<ip> {
   protected flc(fix $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ip $$7, fmp $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static class a implements flx<ip> {
      private final fmp a;

      public a(fmp $$0) {
         this.a = $$0;
      }

      public flu a(ip $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flc($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
      }
   }
}
