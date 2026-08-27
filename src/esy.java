public record esy(int a, int b) {
   public static esy a(esw $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new esy($$1, $$2);
         case b -> new esy($$2, $$1);
      };
   }

   public esy a(esx $$0) {
      return switch ($$0) {
         case b -> new esy(this.a, this.b + 1);
         case a -> new esy(this.a, this.b - 1);
         case c -> new esy(this.a - 1, this.b);
         case d -> new esy(this.a + 1, this.b);
      };
   }

   public int a(esw $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
