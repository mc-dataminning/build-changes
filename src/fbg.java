public record fbg(int a, int b) {
   public static fbg a(fbe $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fbg($$1, $$2);
         case b -> new fbg($$2, $$1);
      };
   }

   public fbg a(fbf $$0) {
      return switch ($$0) {
         case b -> new fbg(this.a, this.b + 1);
         case a -> new fbg(this.a, this.b - 1);
         case c -> new fbg(this.a - 1, this.b);
         case d -> new fbg(this.a + 1, this.b);
      };
   }

   public int a(fbe $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
