public class fmf extends flh {
   protected fmf(fis $$0, double $$1, double $$2, double $$3, double $$4, fmk $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements fls<ja> {
      private final fmk a;

      public a(fmk $$0) {
         this.a = $$0;
      }

      public flp a(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmf($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
