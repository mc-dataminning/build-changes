public class fts extends fsj {
   fts(fpx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ftu $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements ftc<kc> {
      private final ftu a;

      public a(ftu $$0) {
         this.a = $$0;
      }

      public fsz a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fts($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
