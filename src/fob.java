public record fob(gir a, gir b, gir c) {
   public static fob a(ali $$0) {
      return new fob(gir.u($$0), gir.y($$0), gir.w($$0));
   }

   public static fob b(ali $$0) {
      return new fob(gir.t($$0), gir.x($$0), gir.v($$0));
   }

   public gir a(fks.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
