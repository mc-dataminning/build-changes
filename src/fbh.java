public record fbh(int a, int b) {
   public static fbh a(fbf $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fbh($$1, $$2);
         case b -> new fbh($$2, $$1);
      };
   }

   public fbh a(fbg $$0) {
      return switch ($$0) {
         case b -> new fbh(this.a, this.b + 1);
         case a -> new fbh(this.a, this.b - 1);
         case c -> new fbh(this.a - 1, this.b);
         case d -> new fbh(this.a + 1, this.b);
      };
   }

   public int a(fbf $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
