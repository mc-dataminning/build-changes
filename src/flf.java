public record flf(gfh a, gfh b, gfh c) {
   public static flf a(akr $$0) {
      return new flf(gfh.u($$0), gfh.y($$0), gfh.w($$0));
   }

   public static flf b(akr $$0) {
      return new flf(gfh.t($$0), gfh.x($$0), gfh.v($$0));
   }

   public gfh a(fhx.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
