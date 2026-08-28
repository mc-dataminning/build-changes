public record fsk(int a, int b) {
   public static fsk a(fsi $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fsk($$1, $$2);
         case b -> new fsk($$2, $$1);
      };
   }

   public fsk a(fsj $$0) {
      return switch ($$0) {
         case b -> new fsk(this.a, this.b + 1);
         case a -> new fsk(this.a, this.b - 1);
         case c -> new fsk(this.a - 1, this.b);
         case d -> new fsk(this.a + 1, this.b);
      };
   }

   public int a(fsi $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
