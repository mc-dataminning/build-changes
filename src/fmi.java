public class fmi extends flb {
   fmi(fis $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fmk $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements fls<ja> {
      private final fmk a;

      public a(fmk $$0) {
         this.a = $$0;
      }

      public flp a(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmi($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
