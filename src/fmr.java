public record fmr(int a, int b) {
   public static fmr a(fmp $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fmr($$1, $$2);
         case b -> new fmr($$2, $$1);
      };
   }

   public fmr a(fmq $$0) {
      return switch ($$0) {
         case b -> new fmr(this.a, this.b + 1);
         case a -> new fmr(this.a, this.b - 1);
         case c -> new fmr(this.a - 1, this.b);
         case d -> new fmr(this.a + 1, this.b);
      };
   }

   public int a(fmp $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
