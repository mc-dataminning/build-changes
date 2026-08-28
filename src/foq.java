public record foq(int a, int b) {
   public static foq a(foo $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new foq($$1, $$2);
         case b -> new foq($$2, $$1);
      };
   }

   public foq a(fop $$0) {
      return switch ($$0) {
         case b -> new foq(this.a, this.b + 1);
         case a -> new foq(this.a, this.b - 1);
         case c -> new foq(this.a - 1, this.b);
         case d -> new foq(this.a + 1, this.b);
      };
   }

   public int a(foo $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
