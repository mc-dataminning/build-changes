public record frn(gmi a, gmi b, gmi c) {
   public static frn a(akv $$0) {
      return new frn(gmi.v($$0), gmi.z($$0), gmi.x($$0));
   }

   public static frn b(akv $$0) {
      return new frn(gmi.u($$0), gmi.y($$0), gmi.w($$0));
   }

   public gmi a(foc.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
