public record fms(int a, int b) {
   public static fms a(fmq $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fms($$1, $$2);
         case b -> new fms($$2, $$1);
      };
   }

   public fms a(fmr $$0) {
      return switch ($$0) {
         case b -> new fms(this.a, this.b + 1);
         case a -> new fms(this.a, this.b - 1);
         case c -> new fms(this.a - 1, this.b);
         case d -> new fms(this.a + 1, this.b);
      };
   }

   public int a(fmq $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
