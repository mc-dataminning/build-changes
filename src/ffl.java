public record ffl(int a, int b) {
   public static ffl a(ffj $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new ffl($$1, $$2);
         case b -> new ffl($$2, $$1);
      };
   }

   public ffl a(ffk $$0) {
      return switch ($$0) {
         case b -> new ffl(this.a, this.b + 1);
         case a -> new ffl(this.a, this.b - 1);
         case c -> new ffl(this.a - 1, this.b);
         case d -> new ffl(this.a + 1, this.b);
      };
   }

   public int a(ffj $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
