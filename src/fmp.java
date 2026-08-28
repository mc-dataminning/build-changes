public record fmp(int a, int b) {
   public static fmp a(fmn $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fmp($$1, $$2);
         case b -> new fmp($$2, $$1);
      };
   }

   public fmp a(fmo $$0) {
      return switch ($$0) {
         case b -> new fmp(this.a, this.b + 1);
         case a -> new fmp(this.a, this.b - 1);
         case c -> new fmp(this.a - 1, this.b);
         case d -> new fmp(this.a + 1, this.b);
      };
   }

   public int a(fmn $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
