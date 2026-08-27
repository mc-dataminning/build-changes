public class fmk extends fks {
   protected fmk(fiz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, fmr $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, 0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.3F, 8, -0.1F, true);
   }

   public static class a implements flz<ja> {
      private final fmr a;

      public a(fmr $$0) {
         this.a = $$0;
      }

      public flw a(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmk($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
