public class fmj extends flc {
   fmj(fis $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fml $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements flt<iy> {
      private final fml a;

      public a(fml $$0) {
         this.a = $$0;
      }

      public flq a(iy $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmj($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
