public record fta(int a, int b) {
   public static fta a(fsy $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fta($$1, $$2);
         case b -> new fta($$2, $$1);
      };
   }

   public fta a(fsz $$0) {
      return switch ($$0) {
         case b -> new fta(this.a, this.b + 1);
         case a -> new fta(this.a, this.b - 1);
         case c -> new fta(this.a - 1, this.b);
         case d -> new fta(this.a + 1, this.b);
      };
   }

   public int a(fsy $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
