public record flz(int a, int b) {
   public static flz a(flx $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new flz($$1, $$2);
         case b -> new flz($$2, $$1);
      };
   }

   public flz a(fly $$0) {
      return switch ($$0) {
         case b -> new flz(this.a, this.b + 1);
         case a -> new flz(this.a, this.b - 1);
         case c -> new flz(this.a - 1, this.b);
         case d -> new flz(this.a + 1, this.b);
      };
   }

   public int a(flx $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
