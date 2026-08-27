public record fid(int a, int b) {
   public static fid a(fib $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fid($$1, $$2);
         case b -> new fid($$2, $$1);
      };
   }

   public fid a(fic $$0) {
      return switch ($$0) {
         case b -> new fid(this.a, this.b + 1);
         case a -> new fid(this.a, this.b - 1);
         case c -> new fid(this.a - 1, this.b);
         case d -> new fid(this.a + 1, this.b);
      };
   }

   public int a(fib $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
