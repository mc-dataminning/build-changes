public record fbt(int a, int b) {
   public static fbt a(fbr $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fbt($$1, $$2);
         case b -> new fbt($$2, $$1);
      };
   }

   public fbt a(fbs $$0) {
      return switch ($$0) {
         case b -> new fbt(this.a, this.b + 1);
         case a -> new fbt(this.a, this.b - 1);
         case c -> new fbt(this.a - 1, this.b);
         case d -> new fbt(this.a + 1, this.b);
      };
   }

   public int a(fbr $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
