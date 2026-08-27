public class flf extends fly {
   protected flf(fin $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fmf $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, 2.5F, $$7);
   }

   public static class a implements fln<iy> {
      private final fmf a;

      public a(fmf $$0) {
         this.a = $$0;
      }

      public flk a(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flf($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
