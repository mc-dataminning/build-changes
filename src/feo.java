public record feo(int a, int b) {
   public static feo a(fem $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new feo($$1, $$2);
         case b -> new feo($$2, $$1);
      };
   }

   public feo a(fen $$0) {
      return switch ($$0) {
         case b -> new feo(this.a, this.b + 1);
         case a -> new feo(this.a, this.b - 1);
         case c -> new feo(this.a - 1, this.b);
         case d -> new feo(this.a + 1, this.b);
      };
   }

   public int a(fem $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
