public record flx(int a, int b) {
   public static flx a(flv $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new flx($$1, $$2);
         case b -> new flx($$2, $$1);
      };
   }

   public flx a(flw $$0) {
      return switch ($$0) {
         case b -> new flx(this.a, this.b + 1);
         case a -> new flx(this.a, this.b - 1);
         case c -> new flx(this.a - 1, this.b);
         case d -> new flx(this.a + 1, this.b);
      };
   }

   public int a(flv $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
