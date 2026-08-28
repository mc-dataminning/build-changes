public record ftw(int a, int b) {
   public static ftw a(ftu $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new ftw($$1, $$2);
         case b -> new ftw($$2, $$1);
      };
   }

   public ftw a(ftv $$0) {
      return switch ($$0) {
         case b -> new ftw(this.a, this.b + 1);
         case a -> new ftw(this.a, this.b - 1);
         case c -> new ftw(this.a - 1, this.b);
         case d -> new ftw(this.a + 1, this.b);
      };
   }

   public int a(ftu $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
