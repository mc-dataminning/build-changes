public record fog(int a, int b) {
   public static fog a(foe $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fog($$1, $$2);
         case b -> new fog($$2, $$1);
      };
   }

   public fog a(fof $$0) {
      return switch ($$0) {
         case b -> new fog(this.a, this.b + 1);
         case a -> new fog(this.a, this.b - 1);
         case c -> new fog(this.a - 1, this.b);
         case d -> new fog(this.a + 1, this.b);
      };
   }

   public int a(foe $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
