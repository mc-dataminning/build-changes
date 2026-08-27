public record fgi(gah a, gah b, gah c) {
   public static fgi a(ajt $$0) {
      return new fgi(gah.u($$0), gah.y($$0), gah.w($$0));
   }

   public static fgi b(ajt $$0) {
      return new fgi(gah.t($$0), gah.x($$0), gah.v($$0));
   }

   public gah a(fda.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
