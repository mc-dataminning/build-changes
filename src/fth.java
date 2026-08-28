public record fth(goi a, goi b, goi c) {
   public static fth a(ald $$0) {
      return new fth(goi.v($$0), goi.z($$0), goi.x($$0));
   }

   public static fth b(ald $$0) {
      return new fth(goi.u($$0), goi.y($$0), goi.w($$0));
   }

   public goi a(fpx.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
