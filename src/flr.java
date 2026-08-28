public record flr(int a, int b) {
   public static flr a(flp $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new flr($$1, $$2);
         case b -> new flr($$2, $$1);
      };
   }

   public flr a(flq $$0) {
      return switch ($$0) {
         case b -> new flr(this.a, this.b + 1);
         case a -> new flr(this.a, this.b - 1);
         case c -> new flr(this.a - 1, this.b);
         case d -> new flr(this.a + 1, this.b);
      };
   }

   public int a(flp $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
