public class fry extends fsa {
   protected fry(fqe $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, fuc $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.5F, 20, 0.1F, false);
   }

   public static class a implements ftk<kc> {
      private final fuc a;

      public a(fuc $$0) {
         this.a = $$0;
      }

      public fth a(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fry($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, 1.0F, this.a);
      }
   }
}
