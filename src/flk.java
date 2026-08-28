public record flk(int a, int b) {
   public static flk a(fli $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new flk($$1, $$2);
         case b -> new flk($$2, $$1);
      };
   }

   public flk a(flj $$0) {
      return switch ($$0) {
         case b -> new flk(this.a, this.b + 1);
         case a -> new flk(this.a, this.b - 1);
         case c -> new flk(this.a - 1, this.b);
         case d -> new flk(this.a + 1, this.b);
      };
   }

   public int a(fli $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
