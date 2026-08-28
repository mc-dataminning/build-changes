public record fle(int a, int b) {
   public static fle a(flc $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fle($$1, $$2);
         case b -> new fle($$2, $$1);
      };
   }

   public fle a(fld $$0) {
      return switch ($$0) {
         case b -> new fle(this.a, this.b + 1);
         case a -> new fle(this.a, this.b - 1);
         case c -> new fle(this.a - 1, this.b);
         case d -> new fle(this.a + 1, this.b);
      };
   }

   public int a(flc $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
