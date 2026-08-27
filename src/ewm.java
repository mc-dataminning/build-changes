public record ewm(int a, int b) {
   public static ewm a(ewk $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new ewm($$1, $$2);
         case b -> new ewm($$2, $$1);
      };
   }

   public ewm a(ewl $$0) {
      return switch ($$0) {
         case b -> new ewm(this.a, this.b + 1);
         case a -> new ewm(this.a, this.b - 1);
         case c -> new ewm(this.a - 1, this.b);
         case d -> new ewm(this.a + 1, this.b);
      };
   }

   public int a(ewk $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
