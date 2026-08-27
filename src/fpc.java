public class fpc extends fnu {
   fpc(flj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fpe $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements fol<jv> {
      private final fpe a;

      public a(fpe $$0) {
         this.a = $$0;
      }

      public foi a(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fpc($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
