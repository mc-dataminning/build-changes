public record fll(int a, int b) {
   public static fll a(flj $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fll($$1, $$2);
         case b -> new fll($$2, $$1);
      };
   }

   public fll a(flk $$0) {
      return switch ($$0) {
         case b -> new fll(this.a, this.b + 1);
         case a -> new fll(this.a, this.b - 1);
         case c -> new fll(this.a - 1, this.b);
         case d -> new fll(this.a + 1, this.b);
      };
   }

   public int a(flj $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
