public class fmn extends flg {
   fmn(fix $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fmp $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements flx<iy> {
      private final fmp a;

      public a(fmp $$0) {
         this.a = $$0;
      }

      public flu a(iy $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmn($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
