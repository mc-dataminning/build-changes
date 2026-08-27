public class frq extends frs {
   protected frq(fpx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, ftu $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.5F, 20, 0.1F, false);
   }

   public static class a implements ftc<kc> {
      private final ftu a;

      public a(ftu $$0) {
         this.a = $$0;
      }

      public fsz a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new frq($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, 1.0F, this.a);
      }
   }
}
