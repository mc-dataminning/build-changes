public record fds(int a, int b) {
   public static fds a(fdq $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fds($$1, $$2);
         case b -> new fds($$2, $$1);
      };
   }

   public fds a(fdr $$0) {
      return switch ($$0) {
         case b -> new fds(this.a, this.b + 1);
         case a -> new fds(this.a, this.b - 1);
         case c -> new fds(this.a - 1, this.b);
         case d -> new fds(this.a + 1, this.b);
      };
   }

   public int a(fdq $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
