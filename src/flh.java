public record flh(int a, int b) {
   public static flh a(flf $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new flh($$1, $$2);
         case b -> new flh($$2, $$1);
      };
   }

   public flh a(flg $$0) {
      return switch ($$0) {
         case b -> new flh(this.a, this.b + 1);
         case a -> new flh(this.a, this.b - 1);
         case c -> new flh(this.a - 1, this.b);
         case d -> new flh(this.a + 1, this.b);
      };
   }

   public int a(flf $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
