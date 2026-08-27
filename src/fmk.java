public class fmk extends flm {
   protected fmk(fix $$0, double $$1, double $$2, double $$3, double $$4, fmp $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements flx<ja> {
      private final fmp a;

      public a(fmp $$0) {
         this.a = $$0;
      }

      public flu a(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmk($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
