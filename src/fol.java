public class fol extends fnn {
   protected fol(fkw $$0, double $$1, double $$2, double $$3, double $$4, foq $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements fny<jv> {
      private final foq a;

      public a(foq $$0) {
         this.a = $$0;
      }

      public fnv a(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fol($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
