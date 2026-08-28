public record fqd(int a, int b) {
   public static fqd a(fqb $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fqd($$1, $$2);
         case b -> new fqd($$2, $$1);
      };
   }

   public fqd a(fqc $$0) {
      return switch ($$0) {
         case b -> new fqd(this.a, this.b + 1);
         case a -> new fqd(this.a, this.b - 1);
         case c -> new fqd(this.a - 1, this.b);
         case d -> new fqd(this.a + 1, this.b);
      };
   }

   public int a(fqb $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
