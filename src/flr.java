public class flr extends fkt {
   protected flr(fii $$0, double $$1, double $$2, double $$3, double $$4, flw $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements fle<iy> {
      private final flw a;

      public a(flw $$0) {
         this.a = $$0;
      }

      public flb a(iy $$0, fii $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flr($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
