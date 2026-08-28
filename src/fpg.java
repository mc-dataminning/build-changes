public record fpg(int a, int b) {
   public static fpg a(fpe $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fpg($$1, $$2);
         case b -> new fpg($$2, $$1);
      };
   }

   public fpg a(fpf $$0) {
      return switch ($$0) {
         case b -> new fpg(this.a, this.b + 1);
         case a -> new fpg(this.a, this.b - 1);
         case c -> new fpg(this.a - 1, this.b);
         case d -> new fpg(this.a + 1, this.b);
      };
   }

   public int a(fpe $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
