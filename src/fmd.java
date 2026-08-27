public class fmd extends fkw {
   fmd(fin $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fmf $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements fln<iy> {
      private final fmf a;

      public a(fmf $$0) {
         this.a = $$0;
      }

      public flk a(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
