public class fma extends flc {
   protected fma(fin $$0, double $$1, double $$2, double $$3, double $$4, fmf $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements fln<iy> {
      private final fmf a;

      public a(fmf $$0) {
         this.a = $$0;
      }

      public flk a(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fma($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
