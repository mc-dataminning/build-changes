public class ftx extends fsz {
   protected ftx(fqe $$0, double $$1, double $$2, double $$3, double $$4, fuc $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements ftk<kc> {
      private final fuc a;

      public a(fuc $$0) {
         this.a = $$0;
      }

      public fth a(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ftx($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
