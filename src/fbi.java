public record fbi(int a, int b) {
   public static fbi a(fbg $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fbi($$1, $$2);
         case b -> new fbi($$2, $$1);
      };
   }

   public fbi a(fbh $$0) {
      return switch ($$0) {
         case b -> new fbi(this.a, this.b + 1);
         case a -> new fbi(this.a, this.b - 1);
         case c -> new fbi(this.a - 1, this.b);
         case d -> new fbi(this.a + 1, this.b);
      };
   }

   public int a(fbg $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
