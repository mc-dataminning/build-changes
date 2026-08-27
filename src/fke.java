public record fke(int a, int b) {
   public static fke a(fkc $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fke($$1, $$2);
         case b -> new fke($$2, $$1);
      };
   }

   public fke a(fkd $$0) {
      return switch ($$0) {
         case b -> new fke(this.a, this.b + 1);
         case a -> new fke(this.a, this.b - 1);
         case c -> new fke(this.a - 1, this.b);
         case d -> new fke(this.a + 1, this.b);
      };
   }

   public int a(fkc $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
